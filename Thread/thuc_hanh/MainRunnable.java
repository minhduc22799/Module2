package thuc_hanh;

public class MainRunnable {
    public static void main(String[] args) {
        RunnableDemo runnableDemo = new RunnableDemo("Thread -1-HR-Dâtbase");
        runnableDemo.start();
        RunnableDemo runnableDemo1 = new RunnableDemo("Thread - 2 - Send - Email");
        runnableDemo1.start();
        System.out.println("Main thread stopped!!");
    }
}
