package thuc_hanh;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi : ");
        String string = scanner.nextLine();
        LinkedList<Character> arrMax = new LinkedList<>();
        for (int i = 0; i< string.length(); i++){
            LinkedList <Character> list = new LinkedList<>();

            list.add(string.charAt(i));

            for (int j = i+1; j< string.length();j++){
                if (string.charAt(j) > list.getLast() ){
                    list.add(string.charAt(j));
                }
            }
            if (list.size() > arrMax.size()){
                arrMax.clear();
                arrMax.addAll(list);
            }
            list.clear();
        }
        for (Character c: arrMax) {
            System.out.println(c);
        }
    }
}
