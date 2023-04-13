package shape;

public class Triangle {
    private double side1 = 1.0;
    private double side2 = 1.0;
    private double side3 = 1.0;
    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Triangle(double side1, double side2, double side3, String color) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.color = color;
    }

    public Triangle() {
        side1 = 1.0;
        side2 = 1.0;
        side3 = 1.0;
        color = "red";

    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getPerimeter() {
        double chuVi = getSide1() + getSide2() + getSide3();
        return chuVi;
    }

    public double getArea() {
        double p = this.getPerimeter() / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", chu vi la: " + getPerimeter() +
                ", dien tich la:  " + getArea() +
                ", color: " + getColor() +
                '}';
    }
}
