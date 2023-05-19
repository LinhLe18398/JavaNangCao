package File_In_OutputStream;

import java.io.IOException;

public class MainPractise2 {
    public static void main(String[] args) {
       Practise2_Again practise2Again = new Practise2_Again();
        String data = "hello anh em nhe";
        String fileName = "data1.dat";
        try {
            practise2Again.writeData(data,fileName);
            System.out.println(practise2Again.readData(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
