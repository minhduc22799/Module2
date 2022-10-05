import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year");
        int year = scanner.nextInt();
        if (year % 4 == 0){
            if (year % 100 == 0){
                if (year % 400 == 0){
                    System.out.printf("%d la nam nhuan", year);
                }else {
                    System.out.printf("%d khong la nam nhuan", year);
                }
            }else {
                System.out.printf("%d la nam nhuan", year);
            }
        }else {
            System.out.printf("%d khong la nam nhuan", year);
        }
    }
}