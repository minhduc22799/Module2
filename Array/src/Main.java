import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice!=0){
            System.out.println("Menu");
            System.out.println("1. Dao nguoc phan tu");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice){
                case 1:
                        reverseArray();
                    break;

                case 2:
                    break;
                case 3:
                    break;
                case 0:
                  System.exit(0);

                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static void reverseArray(){
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size>20){
                System.out.println("khich thuoc khong duoc vuot qua 20");
            }

        }while (size>20);

        array = new int[size];
        int i = 0;
        while (i< array.length){
            System.out.print("Enter element " + (i+1)+":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Element in Array: ");
        for (int j = 0; j< array.length;j++){
            System.out.println(array[j]+"\t" );
        }

        for (int j = 0; j<array.length/2;j++){
                int temp = array[j];
                array[j] = array[size - 1 - j];
                array[size - 1 - j] = temp;
        }
        System.out.println("\nreverse in Array: ");
        for (int j = 0; j< array.length;j++){
            System.out.println(array[j]+"\t" );
        }

    }




}