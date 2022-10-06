package uocChungLonNhat;

import java.util.Scanner;

public class uocChungLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = scanner.nextInt();
        System.out.println("Enter Number 2");
        int b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if (a==0 || b ==0){
            System.out.println("khong co uoc");
        }else {
            while (a!=b){
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
        }
        System.out.println("Uoc chung lon nhat cua 2 so la: " + a);
    }
}
