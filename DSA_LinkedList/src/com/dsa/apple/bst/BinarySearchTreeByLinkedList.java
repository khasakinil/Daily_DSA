package com.dsa.apple.bst;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchTreeByLinkedList {
    BinaryNode root;

    public BinarySearchTreeByLinkedList() {
        this.root = null;
    }

    public void insert(int nodeValue) {
        root = insert(root, nodeValue);
    }

    private BinaryNode insert(BinaryNode root, int nodeValue) {
        if (root == null) {
            BinaryNode node = new BinaryNode();
            node.setValue(nodeValue);
            root = node;
        } else {
            if (root.getValue() > nodeValue) {
                root.setLeft(insert(root.getLeft(), nodeValue));
            } else if (root.getValue() < nodeValue) {
                root.setRight(insert(root.getRight(), nodeValue));
            }
        }
        return root;
    }

    public void inOrderTraversal() {
        if (root != null) {
            System.out.println("\nInOrderTraversal : ");
            inOrderTraversal(root);
        } else {
            System.out.println("\nBinarySearchTree does not exists");
        }
    }

    private void inOrderTraversal(BinaryNode root) {
        if (root == null) {
            return;
        } else {
            inOrderTraversal(root.getLeft());
            System.out.print(root.getValue() + " ");
            inOrderTraversal(root.getRight());
        }
    }

    public void preOrderTraversal() {
        if (root != null) {
            System.out.println("\nPreOrderTraversal : ");
            preOrderTraversal(root);
        } else {
            System.out.println("\nBinarySearchTree does not exists");
        }
    }

    private void preOrderTraversal(BinaryNode root) {
        if (root == null) {
            return;
        } else {
            System.out.print(root.getValue() + " ");
            preOrderTraversal(root.getLeft());
            preOrderTraversal(root.getRight());
        }
    }

    public void postOrderTraversal() {
        if (root != null) {
            System.out.println("\nPostOrderTraversal : ");
            postOrderTraversal(root);
        } else {
            System.out.println("\nBinarySearchTree does not exists");
        }
    }

    private void postOrderTraversal(BinaryNode root) {
        if (root == null) {
            return;
        } else {
            postOrderTraversal(root.getLeft());
            postOrderTraversal(root.getRight());
            System.out.print(root.getValue() + " ");
        }
    }

    public void levelOrderTraversal() {
        if (root != null) {
            System.out.println("\nLevelOrderTraversal : ");
            levelOrderTraversal(root);
        } else {
            System.out.println("\nBinarySearchTree does not exists");
        }
    }

    private void levelOrderTraversal(BinaryNode root) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode currentNode = queue.remove();
            System.out.print(currentNode.getValue() + " ");
            if (currentNode.getLeft() != null) {
                queue.add(currentNode.getLeft());
            }
            if (currentNode.getRight() != null) {
                queue.add(currentNode.getRight());
            }
        }
    }

    public void searchNode(int nodeValue) {
        if (root != null) {
            searchNode(root, nodeValue);
        } else {
            System.out.println("\nBinarySearchTree does not exists");
        }
    }

    private void searchNode(BinaryNode root, int nodeValue) {
        if (root == null) {
            System.out.println("\nNode with value : " + nodeValue + " not found in the binary tree");
            return;
        } else if (root.value == nodeValue) {
            System.out.println("\nNode with value : " + root.getValue() + " found in the binary tree");
        } else if (root.getValue() > nodeValue) {
            searchNode(root.getLeft(), nodeValue);
        } else {
            searchNode(root.getRight(), nodeValue);
        }
    }

    public void deleteNodeFromBST(int nodeValue) {
        if (root != null) {
            deleteNodeFromBST(root, nodeValue);
        } else {
            System.out.println("\nBinarySearchTree does not exists");
        }
    }

    private BinaryNode deleteNodeFromBST(BinaryNode root, int nodeValue) {
        if (root == null) {
            System.out.println("\nNode with value : " + nodeValue + " not found in the binary tree");
            return null;
        } else if (root.getValue() > nodeValue) {
            root.setLeft(deleteNodeFromBST(root.getLeft(), nodeValue));
        } else if (root.getValue() < nodeValue) {
            root.setRight(deleteNodeFromBST(root.getRight(), nodeValue));
        } else {
            if (root.getLeft() != null && root.getRight() != null) {
                BinaryNode tempNode = root;
                BinaryNode minNodeFromRight = minimumElementFromRight(tempNode);
                root.setValue(minNodeFromRight.getValue());
                root.setRight(deleteNodeFromBST(root.getRight(), minNodeFromRight.getValue()));
            } else if (root.getLeft() != null) {
                root = root.getLeft();
            } else if (root.getRight() != null) {
                root = root.getRight();
            } else {
                root = null;
            }
        }

        return root;
    }

    private BinaryNode minimumElementFromRight(BinaryNode currentNode) {
        if (currentNode.getLeft() == null) {
            return currentNode;
        } else {
            return minimumElementFromRight(currentNode.getLeft());
        }
    }
}
