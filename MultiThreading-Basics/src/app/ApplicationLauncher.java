package app;

import workers.RunnableWorker;
import workers.ThreadWorker;

public class ApplicationLauncher {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("[" + Thread.currentThread().getName() + "] " + "Application Started");
        RunnableWorker worker1 = new RunnableWorker();
        RunnableWorker worker2 = new RunnableWorker();
        Thread w1= new Thread(worker1, "Worker-1");
        Thread w2= new Thread(worker2, "Worker-2");
        ThreadWorker w3 = new ThreadWorker("Worker-3");
        w3.setDaemon(true);
        w1.start();
        w2.start();
        w3.start();
        Thread.sleep(1500);
        //System.out.println("[" + Thread.currentThread().getName() + "] " + "Interrupting Worker-2");
        //w2.interrupt();
//        w1.join();
//        w2.join();
//        w3.join();
        System.out.println("[" + Thread.currentThread().getName() + "] " + "Application Finished");
    }
}
