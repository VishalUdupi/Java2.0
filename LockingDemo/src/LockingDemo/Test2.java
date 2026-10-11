package LockingDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test2 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        Runnable writeRunnable = () -> {
        for (int i = 0; i < 10; i++) {
           counter.atomicReadAndIncrement();
        }
        };
        Runnable readRunnable = () -> {
            for (int i = 0; i < 10; i++) {
                counter.seeCounterValue();
            }
        };

        Thread readerthread1 = new Thread(readRunnable, "reader - 1");
        Thread readerthread2 = new Thread(readRunnable, "reader - 2");
        Thread writerthread1 = new Thread(writeRunnable, "writer - 1");
        Thread writerthread2 = new Thread(writeRunnable, "writer - 2");

        readerthread1.start();
        readerthread2.start();
        writerthread1.start();
        writerthread2.start();

        try{
            readerthread1.join();
            readerthread2.join();
            writerthread1.join();
            writerthread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

        counter.seeCounterValue();
    }
}
