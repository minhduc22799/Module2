package bai_tap;

public class EvenThread extends Thread{
    public  void run(){
        for (int i =0; i<=10; i++){
            if (i%2 ==0) {
                System.out.println(i + "\t");
            }
        }try {
            Thread.sleep(10);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }
    }
}
