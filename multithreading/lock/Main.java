package multithreading.lock;

public class Main {
    public static void main(String[] args) {
        BankAccount sbi = new BankAccount();

        Runnable  task = new Runnable() {
            @Override
            public void run() {
                sbi.withdraw(50);
            }
        };

        Thread task1 = new Thread(task,"Thread 1");
        Thread task2 = new Thread(task,"Thread 2");
        task1.start();
        task2.start();
    }
}
