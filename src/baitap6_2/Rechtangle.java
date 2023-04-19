package baitap6_2;

public class Rechtangle implements GeometricObject {
    private double width;
    private double length;

    public Rechtangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Rechtangle{" +
                "width=" + width +
                ", length=" + length +
                '}';
    }

    @Override
    public double getArea() {
        double area = width * length;
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = (width + length) * 2;
        return perimeter;
    }


}
