package com.company;

public class ReverseList {
    class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public Node start = null;
    public Node end = null;
    public void addNode(int data) {
        Node newNode = new Node(data);
        if(start == null) {
            start = newNode;
            end = newNode;
        }
        else {
            end.next = newNode;
            end = newNode;
        }
    }
    public void reverse(Node current) {

        if(start == null) {
            System.out.println("List is empty");
            return;
        }
        else {

            if(current.next == null) {
                System.out.print(current.data + " ");
                return;
            }
            reverse(current.next);
            System.out.print(current.data + " ");
        }
    }
    public void display() {
        Node current = start;
        if(start == null) {
            System.out.println("List is empty");
            return;
        }
        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ReverseList sList = new ReverseList();
        sList.addNode(5);
        sList.addNode(4);
        sList.addNode(3);
        sList.addNode(2);
        sList.addNode(1);
        System.out.println("Initial LinkedList: ");
        sList.display();
        System.out.println("Reversed LinkedList: ");
        sList.reverse(sList.start);
    }
}
