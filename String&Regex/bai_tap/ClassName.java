package bai_tap;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên lớp: ");
        String str = scanner.nextLine();
        String regex ="^[CAP]\\d{4}[GHIKLM]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        boolean match = matcher.matches();
        System.out.println(match);
    }
}
