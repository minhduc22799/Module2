package bai_tap;

public class ThreadMain {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();

        Thread thread = new Thread(oddThread);
        Thread thread1 = new Thread(evenThread);
        thread.start();
        try {
            thread.join(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        thread1.start();
    }
}
