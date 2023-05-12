package java_io;

import java.io.*;
import java.util.Scanner;

public class BaiTapDocGhiFile {
    public static String readFile(String path) throws IOException {
        File file = new File(path);
        try {
            if (!file.exists()){
                throw new FileNotFoundException("khong tim thay file");
            }
                BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
                String newRead = bufferedReader.readLine();
                bufferedReader.close();
                return newRead;

        }catch (Exception e){
            return e.getMessage();
        }
    }



    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập đường dẫn file: ");
        String path = scanner.nextLine();
        BaiTapDocGhiFile baiTapDocGhiFile = new BaiTapDocGhiFile();
        System.out.println(readFile(path));
    }
}
