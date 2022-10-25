import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("\nMenu");
            System.out.println("1.Hinh chu nhat");
            System.out.println("2.Phuong trinh bac 2");
            System.out.println("3. Fan");
            System.out.println("4. Time");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    rectangle();
                    break;

                case 2:
                    quadraticEquation();

                    break;
                case 3:
                    fan();
                    break;

                case 4:
                   stopWatch();
                    break;

                case 0:
                    System.exit(0);

                default:
                    System.out.println("No choice!");
            }
        }

    }

    public static void rectangle() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width: ");
        double width = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your rectangle: " + rectangle.display());
        System.out.println("Area = " + rectangle.getArea());
        System.out.println("Perimeter = " + rectangle.getPerimeter());

    }

    public static void quadraticEquation() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        double delta = quadraticEquation.getDiscriminant();
        if (delta < 0) {
            System.out.println("Phương trình vô nghiệm");
        } else if (delta == 0) {
            System.out.println("Phương trình có nghiệm kép = " + (-b / (2 * a)));
        } else {
            System.out.println("Phương trình có nghiệm 1 = " + quadraticEquation.getRoot1());
            System.out.println("Phương trình có nghiệm 2 = " + quadraticEquation.getRoot2());
        }
    }

    public static void fan() {
        Fan fan1 = new Fan(Fan.MEDIUM, true, 7, "Yellow");
        Fan fan2 = new Fan(Fan.FAST, false, 10, "Red");
        System.out.println(fan1.toString());
        System.out.println(fan2.toString());


    }

    public static void stopWatch() {


    }
}

