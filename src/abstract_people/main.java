package abstract_people;

public class main {
    public static void main(String[] args) {
        StudentImp1 student = new StudentImp1("Tuan Anh", 25, true);
        student.eat();
        student.sleep();
        student.registerCourse("Programming Node JS");
        student.attendClass();

    }
}
