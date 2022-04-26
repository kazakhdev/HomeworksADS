package com.company;
import java.util.LinkedList;
import java.util.Queue;

public class RemoveElement {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Object q_ob;
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(queue.element());
        queue.remove();
        System.out.println("\nElements");
        if ((q_ob = queue.poll()) != null) {
            do System.out.println(q_ob);
            while (null != (q_ob = queue.poll()));
        }
    }
}
