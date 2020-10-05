package test;

import data.structure.Queue;
import data.structure.Stack;

public class Test{
    static void testStack(){
        Stack s =new Stack();
        s.push(2);
        s.push(4);
        s.push(6);
        s.push(8);
        s.pop();
        System.out.println(s);
    }

    static void testQueue(){
        Queue q = new Queue();
        q.enqueue(2);
        q.enqueue(4);
        q.enqueue(6);
        q.dequeue();
        System.out.println(q);
    }
    public static void main(String[] args) {
        testStack();
        testQueue();
    }
}
