package com.vishal.FIFOQueue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class Test {
    public static void main(String[] args) {
        Queue<Integer> linkedListqueue  = new LinkedList<>();
        linkedListqueue.add(1);
        linkedListqueue.add(2);
        linkedListqueue.add(3);
        linkedListqueue.add(4);
        linkedListqueue.add(5);
        linkedListqueue.add(6);
        System.out.println(linkedListqueue);
        Queue<Integer> ArrayDequeQueue = new ArrayDeque<>();
        ArrayDequeQueue.add(1);
        ArrayDequeQueue.add(2);
        ArrayDequeQueue.add(3);
        ArrayDequeQueue.add(4);
        ArrayDequeQueue.add(5);
        ArrayDequeQueue.add(6);
        System.out.println(ArrayDequeQueue);
    }
}
