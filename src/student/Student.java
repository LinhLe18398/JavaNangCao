package student;

public class Student extends People {
    public String classname;

    public Student(){
        super();
        this.classname = "D101_C1K14";
    }
    public Student(String name, boolean gender, int age, String classname) {
        super(name, gender, age);
        this.classname = classname;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public void study() {
        System.out.println("Learning code.......");
    }


    @Override
    public String toString() {
        return "A Student with class name"
                + classname
                + ", which is a subclass of"
                + super.toString();
    }
}
