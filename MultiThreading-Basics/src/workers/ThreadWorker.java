package workers;

public class ThreadWorker extends Thread {
    public ThreadWorker(String name){
        super(name);
    }
    @Override
    public void run() {
        for (int i = 1; i < 4; i++) {
            System.out.println("[" + Thread.currentThread().getName() + "] " + "Step - " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
