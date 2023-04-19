package abstract_people;

public class StudentImp1 extends People implements Student {
    public StudentImp1(String name, int age, boolean gender) {
        super(name, age, gender);
    }

    @Override
    public void eat() {
        System.out.println("dang an com");
    }

    @Override
    public void sleep() {
        System.out.println("dang ngu....");
    }

    @Override
    public void study() {
        System.out.println("dang hoc bai...");
    }

    @Override
    public void registerCourse(String course) {
        System.out.println("da dang ki hoc " + course);
    }

    @Override
    public void attendClass() {
        System.out.println("da tham gia 1 lop hoc");
    }

}
