package com.dsa.generic.apple;

import java.util.*;

/**
 * You have n processes forming a rooted tree structure. You are given two integer arrays pid and ppid, where pid[i] is the ID of the ith process and ppid[i] is the ID of the ith process's parent process.
 * Each process has only one parent process but may have multiple children processes. Only one process has ppid[i] = 0, which means this process has no parent process (the root of the tree).
 * When a process is killed, all of its children processes will also be killed.
 * Given an integer kill representing the ID of a process you want to kill, return a list of the IDs of the processes that will be killed. You may return the answer in any order.
 * Example 1:
 * Input: pid = [1,3,10,5], ppid = [3,0,5,3], kill = 5
 * Output: [5,10]
 * Explanation: The processes colored in red are the processes that should be killed.
 * Example 2:
 * Input: pid = [1], ppid = [0], kill = 1
 * Output: [1]
 */
public class KillProcess {
    public static void main(String[] args) {
        List<Integer> pid = new ArrayList<Integer>(Arrays.asList(1, 3, 10, 5));
        List<Integer> ppid = new ArrayList<Integer>(Arrays.asList(3, 0, 5, 3));
        int kill = 5;
        List<Integer> killList = new ArrayList<>();
        killProcess(pid, ppid, killList, kill);
        System.out.println("Killed Processes : " + killList);
    }

    public static void killProcess(List<Integer> pid, List<Integer> ppid, List<Integer> killList, int kill) {
        Map<Integer, List<Integer>> parentChildrenMap = new HashMap<>();

        for (int i = 0; i < pid.size(); i++) {
            List<Integer> children;
            if (parentChildrenMap.containsKey(ppid.get(i))) {
                children = parentChildrenMap.get(ppid.get(i));
            } else {
                children = new ArrayList<>();
                parentChildrenMap.put(ppid.get(i), children);
            }
            children.add(pid.get(i));
        }
        executeKill(killList, parentChildrenMap, kill);
    }

    private static void executeKill(List<Integer> killList, Map<Integer, List<Integer>> parentChildrenMap, int kill) {
        killList.add(kill);
        if (!parentChildrenMap.containsKey(kill)) {
            return;
        }
        for (Integer child : parentChildrenMap.get(kill)) {
            executeKill(killList, parentChildrenMap, child);
        }
    }
}
