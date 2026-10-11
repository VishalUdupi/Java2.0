package com.vishal.ridesharing;

public class DriverLogin {
    static Runnable DriverTask = () -> {
        try {
            System.out.println(Thread.currentThread().getName() + " Login");
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + " Fetching Profile");
            Thread.sleep(100);
            System.out.println(Thread.currentThread().getName() + " Ready For Ride");
        }catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    };

    public static void main(String[] args) {
        Thread t1 = new Thread(DriverTask,"Driver - 1");
        Thread t2 = new Thread(DriverTask,"Driver - 2");
        Thread t3 = new Thread(DriverTask,"Driver - 3");
        Thread t4 = new Thread(DriverTask,"Driver - 4");
        Thread t5 = new Thread(DriverTask,"Driver - 5");
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        try{
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
