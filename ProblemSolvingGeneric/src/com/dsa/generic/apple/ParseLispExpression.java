package com.dsa.generic.apple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 736. Parse Lisp Expression
 * You are given a string expression representing a Lisp-like expression to return the integer value of.
 * The syntax for these expressions is given as follows.
 * An expression is either an integer, let expression, add expression, mult expression, or an assigned variable. Expressions always evaluate to a single integer.
 * (An integer could be positive or negative.)
 * A let expression takes the form "(let v1 e1 v2 e2 ... vn en expr)", where let is always the string "let", then there are one or more pairs of alternating variables and expressions, meaning that the first variable v1 is assigned the value of the expression e1, the second variable v2 is assigned the value of the expression e2, and so on sequentially; and then the value of this let expression is the value of the expression expr.
 * An add expression takes the form "(add e1 e2)" where add is always the string "add", there are always two expressions e1, e2 and the result is the addition of the evaluation of e1 and the evaluation of e2.
 * A mult expression takes the form "(mult e1 e2)" where mult is always the string "mult", there are always two expressions e1, e2 and the result is the multiplication of the evaluation of e1 and the evaluation of e2.
 * For this question, we will use a smaller subset of variable names. A variable starts with a lowercase letter, then zero or more lowercase letters or digits. Additionally, for your convenience, the names "add", "let", and "mult" are protected and will never be used as variable names.
 * Finally, there is the concept of scope. When an expression of a variable name is evaluated, within the context of that evaluation, the innermost scope (in terms of parentheses) is checked first for the value of that variable, and then outer scopes are checked sequentially. It is guaranteed that every expression is legal. Please see the examples for more details on the scope.
 * Example 1:
 * Input: expression = "(let x 2 (mult x (let x 3 y 4 (add x y))))"
 * Output: 14
 * Explanation: In the expression (add x y), when checking for the value of the variable x,
 * we check from the innermost scope to the outermost in the context of the variable we are trying to evaluate.
 * Since x = 3 is found first, the value of x is 3.
 * Example 2:
 * Input: expression = "(let x 3 x 2 x)"
 * Output: 2
 * Explanation: Assignment in let statements is processed sequentially.
 * Example 3:
 * Input: expression = "(let x 1 y 2 x (add x y) (add x y))"
 * Output: 5
 * Explanation: The first (add x y) evaluates as 3, and is assigned to x.
 * The second (add x y) evaluates as 3+2 = 5.
 */

public class ParseLispExpression {
    public static void main(String[] args) {
        String expression = "(let x 1 y 2 x (add x y) (add x y))";
        System.out.println(evaluate(expression));
    }

    public static int evaluate(String expression) {
        return evaluateExpression(expression, new HashMap<>());
    }

    private static int evaluateExpression(String expression, HashMap<String, Integer> map) {
        if (isNumber(expression)) {
            return Integer.parseInt(expression);
        }

        if (isVariable(expression)) {
            return map.get(expression);
        }

        int result;
        List<String> list = parseList(expression);
        if (list.get(0).equals("add")) {
            result = evaluateExpression(list.get(1), map) + evaluateExpression(list.get(2), map);
        } else if (list.get(0).equals("mult")) {
            result = evaluateExpression(list.get(1), map) * evaluateExpression(list.get(2), map);
        } else {
            Map<String, Integer> newMap = new HashMap<>(map);
            for (int i = 1; i < list.size() - 1; i += 2) {
                newMap.put(list.get(i), evaluateExpression(list.get(i + 1), (HashMap<String, Integer>) newMap));
            }
            result = evaluateExpression(list.get(list.size() - 1), (HashMap<String, Integer>) newMap);
        }

        return result;
    }

    private static List<String> parseList(String expression) {
        List<String> result = new ArrayList<>();
        expression = expression.substring(1, expression.length() - 1);
        int startIndex = 0;
        while (startIndex < expression.length()) {
            int encIndex = nextIndex(expression, startIndex);
            result.add(expression.substring(startIndex, encIndex));
            startIndex = encIndex + 1;
        }
        return result;
    }

    private static int nextIndex(String expression, int startIndex) {
        int index =startIndex;
        if(expression.charAt(index) == '('){
            int count = 1;
            index++;
            while(index<expression.length() && count>0){
                if(expression.charAt(index) == '('){
                    count++;
                } else if (expression.charAt(index) == ')') {
                    count--;
                }
                index++;
            }
        }else{
            while(index<expression.length() && expression.charAt(index)!=' '){
                index++;
            }
        }
        return index;
    }

    private static boolean isVariable(String expression) {
        char c = expression.charAt(0);
        return c >= 'a' && c <= 'z';
    }

    private static boolean isNumber(String expression) {
        char c = expression.charAt(0);
        return c >= '0' && c <= '9' || c == '-';
    }
}
