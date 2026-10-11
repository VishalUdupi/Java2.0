package com.vishal.ridesharing;

import java.util.ArrayList;
import java.util.List;

public class PassengerArrival {
    public static void main(String[] args) {
        List<Thread> threadList = new ArrayList<>();
        for(int i=1; i<=10; i++){
            int finalI = i;
            Thread t = new Thread(() -> {
                System.out.println("Passenger " + finalI + " arrived on " + Thread.currentThread().getName());
            });
            threadList.add(t);
            t.start();
        }
        for (Thread thread: threadList){
            try {
                thread.join();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
