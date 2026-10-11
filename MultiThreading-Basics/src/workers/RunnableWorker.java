package workers;

public class RunnableWorker implements Runnable {
    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                if (Thread.currentThread().isInterrupted()) {
                    System.out.println("[" + Thread.currentThread().getName() + "] Interrupted. Stopping work.");
                    return;
                }

                System.out.println("[" + Thread.currentThread().getName() + "] Step - " + i);

                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("[" + Thread.currentThread().getName() + "] Interrupted during sleep. Stopping work.");
            Thread.currentThread().interrupt();
        }
    }
}
