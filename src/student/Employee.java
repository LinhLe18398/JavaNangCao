package student;

public class Employee extends People {
    public String enterprise;

    public Employee(){
        super();
        this.enterprise = "CodeGym";
    }

    public Employee(String enterprise) {
        this.enterprise = enterprise;
    }

    public Employee(String name, boolean gender, int age, String enterprise) {
        super(name, gender, age);
        this.enterprise = enterprise;
    }

    public String getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(String enterprise) {
        this.enterprise = enterprise;
    }

    public void work(){
        System.out.println("Employee is working.... ");
    }

    @Override
    public String toString() {
        return "A Employee work at enterpise: "
                + getEnterprise() +
                " ,which is a subclass of "
                + super.toString();
    }
}
