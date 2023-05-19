package File_In_OutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Practise1 {
    public static void main(String[] args) throws IOException {
        File file = new File("person.dat");
        file.createNewFile();
        FileOutputStream fos = new FileOutputStream(file);
        String data = "Hello world";
        fos.write(data.getBytes());
        fos.close();
        FileInputStream fis = new FileInputStream(file);
        int i = 0;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
            //System.out.println((char)i + (char)fis.read());
        }
        fis.close();

    }
}
