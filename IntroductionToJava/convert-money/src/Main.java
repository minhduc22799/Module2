import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter amount: ");
        int usd = scanner.nextInt();
        System.out.println("Vnd: " +usd*23.865);
    }
}