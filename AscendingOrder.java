package com.company;
import java.util.Stack;

public class AscendingOrder {
    public static Stack<Integer> st = new Stack<>();

    private static void sorting() {
        if (st.isEmpty()) return;
        int number = st.pop();
        sorting();
        sortedStack(number);
    }

    private static void sortedStack(int number) {
        if (!st.isEmpty() && st.peek() >= number) {
            int front = st.pop();
            sortedStack(number);
            st.push(front);
        } else {
            st.push(number);
        }

    }

    public static void main(String[] args) {
        st.push(4);
        st.push(-5);
        st.push(8);
        st.push(39);
        st.push(-7);
        st.push(0);
        sorting();
        System.out.println("\n" + st);
    }
}

