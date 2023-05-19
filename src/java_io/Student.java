package java_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Student {
    public String Id;
    public   String name;
    public double diemToan;
    public double diemLy;
    public double diemHoa;

    public Student(String id, String name, double diemToan, double diemLy, double diemHoa) {
        Id = id;
        this.name = name;
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiemToan() {
        return diemToan;
    }

    public void setDiemToan(double diemToan) {
        this.diemToan = diemToan;
    }

    public double getDiemLy() {
        return diemLy;
    }

    public void setDiemLy(double diemLy) {
        this.diemLy = diemLy;
    }

    public double getDiemHoa() {
        return diemHoa;
    }

    public void setDiemHoa(double diemHoa) {
        this.diemHoa = diemHoa;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                ", diemToan=" + diemToan +
                ", diemLy=" + diemLy +
                ", diemHoa=" + diemHoa +
                '}';
    }



    public static boolean saveInfo(Student student, String fileName){
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName,true));
            bufferedWriter.write(student.getId() + ", " + student.getName() + ", " + student.getDiemToan() + ", " + student.getDiemLy() + ", " + student.getDiemHoa());
            bufferedWriter.close();
            return true;
        } catch (IOException e) {
            return false;
        }
    }

}
