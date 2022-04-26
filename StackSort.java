package com.company;
import java.util.Stack;
public class StackSort{
    public static Stack<Integer> st = new Stack<>();
    private static void sorting() {
        int number= st.pop();
        if (st.isEmpty()) return;
        sorting();
        sortedStack(number);
    }
    private static void sortedStack(int number) {
        if (!st.isEmpty() && st.peek() <= number) {
            int front = st.pop();
            sortedStack(number);

            st.push(front);
        } else {
            st.push(number);
            return;
        }

    }
    public static void main(String[] args) {
        st.add(4);
        st.add(-5);
        st.add(8);
        st.add(39);
        st.add(-7);
        st.add(0);
        sorting();
        System.out.println(st);
    }
}