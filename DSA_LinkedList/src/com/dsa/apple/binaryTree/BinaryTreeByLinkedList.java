package com.dsa.apple.binaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeByLinkedList {
    BinaryNode root;

    public BinaryTreeByLinkedList() {
        this.root = null;
    }

    public void insertNodeInBinaryTree(int nodeValue) {
        BinaryNode node = new BinaryNode();
        node.setValue(nodeValue);
        if (root == null) {
            root = node;
            System.out.println("\nInserted node with value : " + nodeValue);
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.getLeft() == null) {
                presentNode.setLeft(node);
                System.out.println("\nNode with value : " + nodeValue + " inserted to the left of " + presentNode.getValue());
                break;
            } else if (presentNode.getRight() == null) {
                presentNode.setRight(node);
                System.out.println("\nNode with value : " + nodeValue + " inserted to the right of " + presentNode.getValue());
                break;
            } else {
                queue.add(presentNode.getLeft());
                queue.add(presentNode.getRight());
            }
        }
    }

    public void levelOrderTraversal() {
        if (root != null) {
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            System.out.println("\nLevel Order Traversal :\n");
            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                System.out.print(presentNode.getValue() + " ");
                if (presentNode.getLeft() != null) {
                    queue.add(presentNode.getLeft());
                }
                if (presentNode.getRight() != null) {
                    queue.add(presentNode.getRight());
                }
            }
        } else {
            System.out.println("\nBinary Tree does not exist");
        }
    }

    public void preOrderTraversal() {
        if (root != null) {
            System.out.println("\nPre Order Traversal :");
            preOrderTraversal(root);
        } else {
            System.out.println("\nBinary Tree does not exist");
        }
    }

    private void preOrderTraversal(BinaryNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.getValue() + " ");
        preOrderTraversal(root.getLeft());
        preOrderTraversal(root.getRight());
    }

    public void inOrderTraversal() {
        if (root != null) {
            System.out.println("\nInOrder Traversal :");
            inOrderTraversal(root);
        } else {
            System.out.println("\nBinary Tree does not exist");
        }
    }

    private void inOrderTraversal(BinaryNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.getLeft());
        System.out.print(root.getValue() + " ");
        inOrderTraversal(root.getRight());
    }

    public void postOrderTraversal() {
        if (root != null) {
            System.out.println("\nPostOrder Traversal :");
            postOrderTraversal(root);
        } else {
            System.out.println("\nBinary Tree does not exist");
        }
    }

    private void postOrderTraversal(BinaryNode root) {
        if (root == null) {
            return;
        }
        postOrderTraversal(root.getLeft());
        postOrderTraversal(root.getRight());
        System.out.print(root.getValue() + " ");
    }

    public void searchNodeInBinaryTree(int nodeValue) {
        if (root != null) {
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                if (presentNode.getValue() == nodeValue) {
                    System.out.println("\nNode with value : " + nodeValue + " found in Binary Tree");
                    return;
                } else {
                    if (presentNode.getLeft() != null) {
                        queue.add(presentNode.getLeft());
                    }
                    if (presentNode.getRight() != null) {
                        queue.add(presentNode.getRight());
                    }
                }
            }
            System.out.println("\nNode with value : " + nodeValue + " not found in Binary Tree");
        } else {
            System.out.println("\nBinary Tree does not exist");
        }
    }

    public void deleteNodeFromBinaryTree(int nodeValue) {
        if (root != null) {
            Queue<BinaryNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                BinaryNode presentNode = queue.remove();
                if (presentNode.getValue() == nodeValue) {
                    presentNode.setValue(getDeepestNode().getValue());
                    deleteDeepestNode();
                    return;
                } else {
                    if (presentNode.getLeft() != null) {
                        queue.add(presentNode.getLeft());
                    }
                    if (presentNode.getRight() != null) {
                        queue.add(presentNode.getRight());
                    }
                }
            }
            System.out.println("\nNode with value : " + nodeValue + " not found in Binary Tree");
        } else {
            System.out.println("\nBinary Tree does not exist");
        }

    }

    private void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        BinaryNode previousNode = null;

        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            if (presentNode.getLeft() == null) {
                previousNode.setRight(null);
                return;
            } else if (presentNode.getRight() == null) {
                presentNode.setLeft(null);
                return;
            }

            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
    }

    private BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
        return presentNode;
    }

    public void deleteTree() {
        if (root != null) {
            root = null;
            System.out.println("\nBinary Tree deleted successfully.");
        } else {
            System.out.println("\nBinary Tree does not exist");
        }
    }
}
