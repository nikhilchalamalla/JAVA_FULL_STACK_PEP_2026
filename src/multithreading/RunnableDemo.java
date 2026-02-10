package multithreading;

public class RunnableDemo implements Runnable {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        new Thread(new RunnableDemo()).start();
    }
}
