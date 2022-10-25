package thuc_hanh;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {


    public static void main(String[] args) {
        System.out.println("Nhap duong dan file");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFile = new ReadFileExample();
        readFile.readFileText(path);
    }
    public void readFileText(String filePath) {
        try {
            File file = new File(filePath);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);

            }
            br.close();

            System.out.println("Tổng = " + sum);
        } catch (Exception e) {
            System.err.println("File khong ton tai noi dung hoac noi dung loi");
        }
    }
}
