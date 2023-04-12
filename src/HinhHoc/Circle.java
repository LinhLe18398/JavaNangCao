package HinhHoc;

public class Circle extends Shape{

    // khai bao them thuoc tinh cho lop con
    private double radius = 1.0;

// tao constructor
    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

// tao getter setter
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

// goi phuong thuc toString de in du lieu ra man hinh
    @Override
    public String toString() {
        return "A circle_cylinder.Circle with radius="
                + getRadius()
                + ", which is a subclass of "
                + super.toString();
    }

}
