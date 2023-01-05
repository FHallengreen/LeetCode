package ImplementQueueusingStacks;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> s1 = new Stack<>();
    private Stack<Integer> s2 = new Stack<>();

    public void push(int x) {
       s1.push(x);
    }

    public int pop() {
       if (!s2.empty()){
           return s2.pop();
       }
       else {
           while (!s1.empty()){
               s2.push(s1.pop());
           }
       }
       return s2.pop();
    }

    public int peek() {
        if (!s2.empty()){
            return s2.peek();
        }
        else {
            while (!s1.empty()){
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    @Override
    public String toString() {
        return "MyQueue{" +
                "s1=" + s1 +
                '}';
    }

    public static void main(String[] args) {


        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.push(2);
        queue.peek();
        queue.pop();
        queue.empty();

        System.out.println(queue);

    }
}