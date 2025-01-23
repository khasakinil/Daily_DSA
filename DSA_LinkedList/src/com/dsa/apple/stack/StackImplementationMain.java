package com.dsa.apple.stack;

public class StackImplementationMain {
    public static void main(String[] args){
        StackImplementation stack = new StackImplementation();
        stack.createStack(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.push(35);
        stack.push(40);
        stack.push(45);
        stack.push(50);
        stack.push(55);
        stack.printStack();

        stack.peek();

        stack.pop();
        stack.printStack();

        stack.pop();
        stack.printStack();
    }
}
