package ImplementQueueusingStacks;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

        private Queue<Integer> q = new LinkedList<>();

    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }
    public int pop() {
    return q.remove();
    }

    public int peek() {
    return q.peek();
    }

    public boolean empty() {
return q.isEmpty();
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