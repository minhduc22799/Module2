package tinhLaiVay;

import java.util.Scanner;

public class vayLai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter money: ");
        double money = scanner.nextDouble();
        System.out.println("Enter month: ");
        int month = scanner.nextInt();
        System.out.println("Enter rate: ");
        double rate = scanner.nextDouble();

        double total = 0;
        for (int i =0; i< month; i++){
            total += money *(rate/100)/12 * money;
        }
        System.out.println("Total = " + total);
    }
}
