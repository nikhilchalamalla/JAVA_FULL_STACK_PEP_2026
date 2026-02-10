package multithreading;

public class EvenOddDemo {
    public static void main(String[] args) {
        new EvenThread().start();
        new OddThread().start();
    }
}
