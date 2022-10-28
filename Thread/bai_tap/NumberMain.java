package bai_tap;

public class NumberMain {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        Thread thread = new Thread(numberGenerator);
        Thread thread1 =  new Thread(numberGenerator);
        int maxPriority = thread1.MAX_PRIORITY;
        int minPriority = thread.MIN_PRIORITY;
        System.out.println(maxPriority+"   "+minPriority);
//        thread.start();
//        thread1.start();

    }



}
