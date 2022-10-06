package veHinh;

import java.util.Scanner;

public class VeHinh {
    public static void main(String[] args) {
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("----Print the rectangle---");
                    for (int i = 0; i<3;i++){
                        for (int j =0; j<7;j++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i=1; i<=5;i++){
                        for (int j = 5; j>=i;j--){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\n");

                    for (int k=1; k<=6;k++){
                        for (int p =1; p<k;p++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\n");

                    for (int h = 1; h<=5;h++){
                        for (int g = 5-h; g>0;g--){
                            System.out.print("  ");
                        }
                        for (int g = 1; g<=h; g++){
                            System.out.print("* ");
                        }
                        System.out.println();
                    }

                    System.out.println("\n");
                    for (int z = 0; z<5;z++){
                         for (int x = 0; x<z;x++){
                             System.out.print("  ");
                         }
                         for (int x = 5-z; x>0;x--){
                             System.out.print("* ");
                         }
                        System.out.println();
                    }

                    break;
                case 3:
                    System.out.println("Print isosceles triangle");

                    break;
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }

}
