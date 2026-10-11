package LockingDemo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int counter;

    Lock lock = new ReentrantLock(true);

    public Counter(){
        this.counter = 0;
    }

    public void seeCounterValue(){
        try{
            lock.lock();
            System.out.println("Value of thread during read: " + counter + " " + Thread.currentThread().getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }

    public void increment(){
        try{
            lock.lock();
            this.counter++;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }

    public int atomicReadAndIncrement(){
        try{
            lock.lock();
            System.out.println("Value of thread before increment: " + counter + " " + Thread.currentThread().getName());
            this.counter++;
            System.out.println("Value of thread after increment: " + counter + " " + Thread.currentThread().getName());
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
        return this.counter;
    }
}
