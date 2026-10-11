package ExecutorServiceDemo_1;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        long timeInSec = System.currentTimeMillis();
        List<Future<?>> futureList = new ArrayList<>(List.of());
        for (int i = 0; i < 6; i++) {
            int finalI = i;
            Future<?> future = executor.submit(
                    () -> {
                        System.out.println("Task started" + finalI + (timeInSec - System.currentTimeMillis()));
                        System.out.println(Thread.currentThread().getName());
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            System.out.println("Thread interrupted");
                        }
                        System.out.println("Task ended" + finalI + (timeInSec - System.currentTimeMillis()));
                    }
            );
            futureList.add(future);
        }
        futureList.getLast().get();
        for(Future<?> f: futureList){
            System.out.println("" + f.isDone() + " " + f.get());
        }
        executor.shutdown();
        while(!executor.awaitTermination(2000, TimeUnit.MILLISECONDS)){
            System.out.println("Waiting on task");
        }
        System.out.println("All tasks done");
    }
}
