package multithreading;

public class NumberThread extends Thread{
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try { Thread.sleep(500); } catch (Exception e) {}
        }
    }

    public static void main(String[] args) {
        new NumberThread().start();
    }
}

