package baitap6_2;

public class Circle implements GeometricObject{
    private double radius;
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
    @Override
    public double getArea(){
        double AreaCircle = 3.14 * radius * radius;
        return AreaCircle;
    }

    @Override
    public double getPerimeter(){
        double perimeterCircle = 2 * 3.14 * radius;
        return perimeterCircle;
    }


}
