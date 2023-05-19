package File_In_OutputStream;

import java.io.*;

public class StudentProcess {

    protected Student[] students;
    protected int count;

    public StudentProcess(){
        this.students = new Student[5];
        this.count = 0;
    }
    public boolean writeStudent(Student objStudent, String fileName) throws IOException {
        this.students[count++] = objStudent;
        try {
            FileOutputStream fos = new FileOutputStream(fileName);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(this.students);
            oos.close();
            bos.close();
            fos.close();
            return true;
        } catch (FileNotFoundException e) {
            System.out.println("ghi khong thanh cong.");
            return false;
        }
    }

    public Student[] readStudent(String fileName) throws IOException, ClassNotFoundException {
        try {
            FileInputStream fis = new FileInputStream(fileName);
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Student[] students = (Student[])ois.readObject();
            ois.close();
            bis.close();
            fis.close();
            //return students;

        } catch (FileNotFoundException e) {
            System.out.println("doc du lieu khong thanh cong");
        }
        return students;
    }

}
