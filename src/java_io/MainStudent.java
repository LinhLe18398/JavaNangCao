package java_io;

import java.io.File;
import java.io.IOException;

public class MainStudent {
    public static void main(String[] args) throws IOException {
        Student student1 = new Student("SV001", "Le Ngoc Linh",9.0,7.5,8.3);
        String fileName = "student.txt";
        boolean result = Student.saveInfo(student1, fileName);
        if (result){
            System.out.println("luu thanh cong thong tin sinh vien");
        }else {
            System.out.println("khong luu duoc");
        }

    }
}
