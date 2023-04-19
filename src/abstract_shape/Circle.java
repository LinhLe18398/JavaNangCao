package abstract_shape;

public class Circle extends Shape {
    protected double radius;
    public Circle(){
        super();
        radius = 1.0;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea(){
        double areaCircle = 3.14 * getRadius() * getRadius();
        return areaCircle;
    }
    @Override
    public double getPerimeter(){
        double perimeterCircle = 2 * 3.14 * getRadius();
        return perimeterCircle;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
