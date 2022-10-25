package bai_tap;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileCopy {

    public static void main(String[] args) {
        String pathOriginal = "\\Module2\\original.txt";
        String pathClone = "\\Module2\\clone.txt";
        File original;
        File cloneOriginal;

        try {
            original = new File(pathOriginal);
            if (!original.exists()){
                original.createNewFile();
            }
            cloneOriginal = new File(pathClone);
            if (!cloneOriginal.exists()){
                cloneOriginal.createNewFile();
            }
            TextFileCopy.copyFile(original,cloneOriginal);
            System.out.println("Sao chep thanh cong");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }


    public static void copyFile(File original, File clone) throws IOException {
        FileReader fileReader = new FileReader(original);
        FileWriter fileWriter = new FileWriter(clone);
        int count;

        while ((count = fileReader.read()) != -1){
            fileWriter.write(count);
        }
        fileWriter.close();
        fileReader.close();

    }
}
