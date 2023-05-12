package java_io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Thuchanh1 {
    public static void main(String[] args) throws IOException {
        File file = new File("demo.txt");
        file.createNewFile();
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write("trong an cut");
        fileWriter.close();
        System.out.println(file.getName());
        System.out.println(file.getAbsolutePath());
    }
}
