package File_In_OutputStream;

import java.io.IOException;

public class StudentApp {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Student student1 = new Student("001","Linh",25,"K14");
        Student student2 = new Student("002","Linh2",26,"K14");
        Student student3 = new Student("003","Linh3",27,"K14");
        Student student4 = new Student("004","Linh4",28,"K14");
        Student student5 = new Student("005","Linh5",29,"K14");
        String fileName = "student.txt";
        StudentProcess studentProcess = new StudentProcess();
        studentProcess.writeStudent(student1,fileName);
        studentProcess.writeStudent(student2,fileName);
        studentProcess.writeStudent(student3,fileName);
        studentProcess.writeStudent(student4,fileName);
        studentProcess.writeStudent(student5,fileName);

        Student[] students = (Student[]) studentProcess.readStudent(fileName);
        for (int i = 0; i < students.length; i++ ){
            System.out.println(students[i]);
        }

    }
}
