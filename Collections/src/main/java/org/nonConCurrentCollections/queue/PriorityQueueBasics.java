package org.nonConCurrentCollections.queue;

import java.util.PriorityQueue;

public class PriorityQueueBasics {
    public static void main(String[] args) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.add(10);
        priorityQueue.add(20);
        priorityQueue.add(30);
        priorityQueue.add(2);
        priorityQueue.forEach(x -> System.out.println(x));
    }
}
