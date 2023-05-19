package File_In_OutputStream;

import java.io.*;
import java.util.Scanner;

public class Practise2 {
    public static boolean writeData(String data, String fileName) throws IOException {
        FileOutputStream outputStream = null;
        try {
            outputStream = new FileOutputStream(fileName);
            byte[] bytes = data.getBytes();
            outputStream.write(bytes);
            System.out.println("da ghi du lieu thanh cong vao file " + fileName);
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("ghi du lieu khong thanh cong ");
            return false;
        } finally {
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

    public static String readData(String fileName) throws IOException {
        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream(fileName);
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);
            String data = new String(buffer, 0, bytesRead);
            System.out.println("du lieu duoc doc tu file : " + fileName);
            return data;
        } catch (IOException e) {
            System.out.println("doc du lieu khong thanh cong");
            throw e;
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
    }

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap du lieu can ghi: ");
        String data = scanner.nextLine();
        File file = new File("data.dat");
        file.createNewFile();
        String fileName = "data.dat";
        try {
            writeData(data, fileName);
        } catch (IOException e) {
            System.out.println("loi: " + e.getMessage());
        }
        try {
            String resultData = readData(fileName);
            System.out.println("file duoc doc thanh cong tu file " + fileName + ": " + resultData);
        } catch (IOException e) {
            System.out.println("loi: " + e.getMessage());
        }

    }


}
