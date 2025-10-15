package interview;

import java.util.concurrent.atomic.AtomicBoolean;

public class Interview {
    public static void main(String[] args) {
        final Object lock = new Object();
        AtomicBoolean hasData = new AtomicBoolean(false);

        Runnable oneToTen = () -> {
            for (int i = 1; i <= 10; i++) {
                synchronized (lock) {
                    while (hasData.get()) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    hasData.set(true);
                    lock.notify();
                }
            }
        };

        Runnable elevenToTwenty = () -> {
            for (int i = 11; i <= 20; i++) {
                synchronized (lock) {
                    while (!hasData.get()) {
                        try {
                            lock.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    System.out.println(Thread.currentThread().getName() + " : " + i);
                    hasData.set(false);
                    lock.notify();
                }
            }
        };

        Thread t1 = new Thread(oneToTen, "T1");
        Thread t2 = new Thread(elevenToTwenty, "T2");
        t1.start();
        t2.start();
    }
}
