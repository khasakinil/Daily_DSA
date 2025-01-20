package com.dsa.apple.linkedlist.singleCircularLL;

public class SingleCircularLinkedList {
    SingleNode head;
    SingleNode tail;

    public SingleNode createSingleCircularLinkedList(int nodeValue) {
        if(head == null){
            SingleNode node  = new SingleNode();
            node.setValue(nodeValue);
            node.setNext(node);
            head = node;
            tail = node;
        }else{
            System.out.println("Linked list already exists");
        }
        return head;
    }

    public void printSingleCircularLinkedList() {
        if(head != null){
            System.out.println();
            SingleNode tempNode = head;
            do{
                System.out.print(tempNode.getValue() + " ");
                tempNode = tempNode.getNext();
            }while(tempNode!=head);
        }else{
            System.out.println("Linked list does not exists..");
        }
    }

    public void insertInSingleCircularLinkedList(int location, int nodeValue) {
        if(head != null){
            SingleNode node = new SingleNode();
            node.setValue(nodeValue);
            if(location == 0){
                node.setNext(head);
                head = node;
                tail.next = node;
            }else{
                int i = 0;
                SingleNode tempNode = head;
                SingleNode currentNode = tempNode;
                do{
                    currentNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }while(tempNode!= head && i<=location-1);

                if(tempNode == head){
                    currentNode.setNext(node);
                    node.setNext(head);
                    tail = node;
                }else{
                    node.setNext(currentNode.getNext());
                    currentNode.setNext(node);
                }
            }
        }else{
            System.out.println("Linked list does not exists..");
        }
    }

    public void deleteFromSingleCircularLinkedList(int location) {
        if(head!=null){
            if(location==0){
                if(head == tail){
                    head.next = null;
                    head = null;
                    tail = null;
                }else{
                    head = head.getNext();
                    tail.setNext(head);
                }
            }else{
                int i =0;
                SingleNode tempNode = head;
                SingleNode currentNode = tempNode;
                do{
                    i++;
                    currentNode = tempNode;
                    if(tempNode.getNext().getNext() == head){
                        tail = tempNode.getNext();
                        tempNode.setNext(head);
                        return;
                    }
                    tempNode = tempNode.getNext();
                }while(tempNode.getNext() != head && i<=location-1);
                currentNode.setNext(currentNode.getNext().getNext());
            }

        }else{
            System.out.println("Linked list does not exists..");
        }
    }

    public void deleteEntireCircularLinkedList() {
        if(head!=null){
            System.out.println();
            tail.next= null;
            head = null;
            tail = null;
            System.out.println("Linked list deleted successfully..");
        }else{
            System.out.println("Linked list does not exists..");
        }
    }
}
