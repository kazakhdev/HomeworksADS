package com.company;

import java.util.LinkedList;

public class FindByIndex {
    Node head;
    static class Node{
        int data;
        Node next;

        Node(int d){
            data = d;
            next =null;
        }
    }
    private void prevItems(FindByIndex list){
        list.head = new Node(10);
        Node second=new Node(11);
        Node third=new Node(12);
        Node fourth=new Node(13);
        Node fifth=new Node(14);
        Node sixth=new Node(15);
        Node seventh=new Node(16);
        list.head.next=second;
        list.head.next.next=third;
        list.head.next.next.next=fourth;
        list.head.next.next.next.next=fifth;
        list.head.next.next.next.next.next=sixth;
        list.head.next.next.next.next.next.next=seventh;
    }
    private void display(String message){
        System.out.println(message);
        Node listNode = head;
        while (listNode!=null){
            System.out.print(listNode.data+ " ");
            listNode= listNode.next;
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        FindByIndex list = new FindByIndex();
        list.prevItems(list);
        list.display("Linked List:");
        System.out.println("Nth index data = " + list.findByIndexData(3));
    }
    private int findByIndexData(int index){
        Node tmp=head;
        int counter = 0;
        while (tmp!=null){
            if(counter==index)
                return tmp.data;
                counter++;
                tmp=tmp.next;
            }
        return -1;
        }
    }

