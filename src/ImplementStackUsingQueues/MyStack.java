package ImplementStackUsingQueues;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
    private static Queue<Integer> q = new LinkedList<>();

    // Equal to Stack push() which pushes  the element onto the top of the stack.
    public void push(int x) {
        q.add(x);
        for (int i = 0; i < q.size() - 1; i++) {
            q.add(q.remove());
        }
    }


    //Removes front of the queue
    public int pop() {
        return q.remove();
    }

    // Returns element at the front
    public int top() {
        return q.peek();
    }

    //If empty return true
    public boolean empty() {
        return q.isEmpty();
    }


    public static void main(String[] args) {
    }
}
