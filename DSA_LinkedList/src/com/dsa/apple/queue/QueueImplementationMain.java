package com.dsa.apple.queue;

public class QueueImplementationMain {
    public static void main(String[] args) {
        QueueImplementation queue = new QueueImplementation();
        queue.createQueue(12);

        queue.enQueue(14);
        queue.printQueue();

        queue.enQueue(15);
        queue.enQueue(16);
        queue.enQueue(18);
        queue.enQueue(20);
        queue.enQueue(22);
        queue.enQueue(24);
        queue.enQueue(26);
        queue.enQueue(28);
        queue.printQueue();
        queue.peekQueue();
        queue.deQueue();
        queue.printQueue();

        queue.deQueue();
        queue.deQueue();
        queue.printQueue();
    }
}
