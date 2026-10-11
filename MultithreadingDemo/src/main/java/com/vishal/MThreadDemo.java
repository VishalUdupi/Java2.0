package com.vishal;

public class MThreadDemo extends Thread{

    @Override
    public void run() {
        System.out.println("Hello inside the thread!");
    }

    public static void main(String[] args) {
        MThreadDemo mThreadDemo = new MThreadDemo();
        mThreadDemo.start();

    }
}
