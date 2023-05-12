package java_io;

import java.io.*;

public class baitap1 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("trongancut.txt");
        file1.createNewFile();

        FileReader fileReader = new FileReader(file1);
        FileWriter fileWriter = new FileWriter(file1);
        fileWriter.write("10\n12");
        fileWriter.close();
      //  System.out.println((char)fileReader.read());
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        System.out.println(bufferedReader.readLine());

    }
}
