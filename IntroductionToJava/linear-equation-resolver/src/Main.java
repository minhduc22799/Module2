import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = scanner.nextDouble();
        System.out.println("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println("Enter c: ");
        double c = scanner.nextDouble();

        if (a!= 0){
            double  answer = (c-b)/a;
            System.out.println("Answer = " + answer);

        }else {
            if (b==c){
                System.out.println("Vo so nghiem");
            }else {
                System.out.println("Vo nghiem");
            }
        }
    }
}