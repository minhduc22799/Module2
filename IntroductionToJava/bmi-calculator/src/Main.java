import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Weight");
        float weight = scanner.nextFloat();
        System.out.println("Enter Height");
        float height = scanner.nextFloat();

        float bmi = weight / (height * height);
        if (bmi < 18)
            System.out.printf("bmi: "+ bmi + " Underweight");
        else if (bmi < 25.0)
            System.out.printf("bmi: "+ bmi + " Normal");
        else if (bmi < 30.0)
            System.out.printf("bmi: "+ bmi + " Overweight");
        else
            System.out.printf("bmi: "+ bmi + " Obese");

    }
}