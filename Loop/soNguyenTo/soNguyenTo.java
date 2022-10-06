package soNguyenTo;

import java.util.Scanner;

public class soNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.printf("%d khong phai so nguyen to", number);
        } else {

            int count = 0;
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    count++;
                }
                if (count == 0) {
                    System.out.printf("%d la so nguyen to", number);
                    break;
                }
                else {
                    System.out.println(number + " khong la so nguyen to");
                    break;
                }


            }
        }
    }
}
