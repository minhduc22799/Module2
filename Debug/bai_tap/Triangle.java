package bai_tap;

import thuc_hanh.CalculationExample;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        try {
            inputSides();
            System.out.println("Very nice triangle!!");
        } catch (IllegalTriangleException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static void inputSides() throws IllegalTriangleException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first side: ");
        int firstSide = scanner.nextInt();
        System.out.println("Enter the second side: ");
        int secondSide = scanner.nextInt();
        System.out.println("Enter the third side: ");
        int thirdSide = scanner.nextInt();

        if (!isTriangle(firstSide, secondSide, thirdSide)) {
            throw new IllegalTriangleException();
        }
    }

    public static boolean isTriangle(int side1, int side2, int side3) {
        return side1 + side2 > side3 && side1 + side3 > side2 && side3 + side2 > side1;
    }

}
