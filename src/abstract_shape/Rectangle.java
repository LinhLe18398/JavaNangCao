package abstract_shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(){
        super();
        width = 1.0;
        length = 1.0;
    }
    public Rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle(double width, double length, String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
@Override
    public double getArea(){
        double areaRechangle = getLength() * getWidth();
        return areaRechangle;
    }
@Override
    public double getPerimeter(){
        double perimeterRechtangle = (getLength() + getWidth()) * 2;
        return perimeterRechtangle;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", length=" + length +
                ", color='" + color + '\'' +
                ", filled=" + filled +
                '}';
    }
}
