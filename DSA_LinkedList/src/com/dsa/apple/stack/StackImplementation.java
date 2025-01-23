package com.dsa.apple.stack;

public class StackImplementation{
    SingleNode head;
    SingleNode tail;


    public void createStack(int nodeValue) {
        SingleNode node = new SingleNode();
        node.setValue(nodeValue);
        node.setNext(null);
        head = node;
        tail = node;
    }

    public void push(int nodeValue) {
        if(head!=null){
            SingleNode node = new SingleNode();
            node.setValue(nodeValue);
            node.setNext(head);
            head = node;
        }else{
            System.out.println("Stack does not exists");
        }
    }

    public void printStack() {
        if(head!=null){
            System.out.println();
            SingleNode tempNode = head;
            while(tempNode!=null){
                System.out.print(tempNode.getValue() + " ");
                tempNode = tempNode.getNext();
            }
        }else{
            System.out.println("Stack does not exists");
        }
    }

    public void peek() {
        if(head!=null){
            System.out.println("Peek() : " + head.getValue());
        }else{
            System.out.println("Stack does not exists");
        }
    }

    public void pop() {
        if(head!=null){
            head = head.getNext();
        }else{
            System.out.println("Stack does not exists");
        }
    }
}
