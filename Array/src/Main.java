import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("\nMenu");
            System.out.println("1. Dao nguoc phan tu");
            System.out.println("2. Tim gia tri trong mang");
            System.out.println("3. Tim gia tri lon nhat");
            System.out.println("4. Chuyen doi C sang F");
            System.out.println("5. Chuyen doi F sang C");
            System.out.println("6. Tim gia tri nho nhat");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    reverseArray();
                    break;

                case 2:
                    findValueInArray();
                    break;
                case 3:
                    findMax();
                    break;
                case 4:
                    System.out.println("Enter c: ");
                    double c = input.nextDouble();
                    System.out.println("f = " + convertFahrenheit(c));
                    break;
                case 5:
                    System.out.println("Enter f: ");
                    double f = input.nextDouble();
                    System.out.println("f = " + convertCelsius(f));
                    break;
                case 6:
                    int arr[] = {2,4,5,6,7,8,9};
                    int index = findMin(arr);
                    System.out.println("Min = "+ arr[index]);
                    break;
                case 0:
                    System.exit(0);

                default:
                    System.out.println("No choice!");
            }
        }
    }

    public static void reverseArray() {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("khich thuoc khong duoc vuot qua 20");
            }

        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Element in Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }

        for (int j = 0; j < array.length / 2; j++) {
            int temp = array[j];
            array[j] = array[size - 1 - j];
            array[size - 1 - j] = temp;
        }
        System.out.println("\nreverse in Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }

    }

    public static void findValueInArray() {
        Scanner input = new Scanner(System.in);
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        System.out.print("Enter a name student: ");
        String input_name = input.nextLine();

        boolean isExit = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals(input_name)) {
                System.out.println(students[i] + "o vi tri  " + i + " trong danh sach");
                break;
            }
        }
        if (isExit) {
            System.out.println("Khong tim thay" + input_name + "trong danh sach");
        }

    }

    public static void findMax() {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) {
                System.out.println("khich thuoc khong duoc vuot qua 20");
            }

        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.print("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Element in Array: ");
        for (int j = 0; j < array.length; j++) {
            System.out.printf(+array[j] + "  ");
        }
        int max = array[0];
        for (int j = 1; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
            }
        }
        System.out.println("\nMax in Array : " + max);

    }

    public static double convertFahrenheit(double celsius) {
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }

    public static double convertCelsius(double fahrenheit) {
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }

    public static int findMin(int[] array){
        int index = 0;
        for (int i=0;i<array.length;i++){
            if (array[i]<array[index]){
                index = i;
            }
        }
        return index;
    }
}