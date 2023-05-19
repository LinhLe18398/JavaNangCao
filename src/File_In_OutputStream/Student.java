package File_In_OutputStream;

import java.io.Serializable;

public class Student implements Serializable {
    public String id;
    public String name;
    public int age;
    public String classStudent;

    public Student(String id, String name, int age, String classStudent) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classStudent = classStudent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassStudent() {
        return classStudent;
    }

    public void setClassStudent(String classStudent) {
        this.classStudent = classStudent;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", classStudent='" + classStudent + '\'' +
                '}';
    }
}
