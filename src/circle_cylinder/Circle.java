package circle_cylinder;

public class Circle {
    public double toaDoX;
    public double toaDoY;
    public double radius;
    public String color;

    public Circle() {
        this.toaDoX = 0;
        this.toaDoY = 0;
        this.radius = 1;
    }

    public Circle(double toaDoX, double toaDoY) {
        this.toaDoX = toaDoX;
        this.toaDoY = toaDoY;
    }

    public Circle(double toaDoX, double toaDoY, double radius) {
        this.toaDoX = toaDoX;
        this.toaDoY = toaDoY;
        this.radius = radius;
    }

    public double getToaDoX() {
        return toaDoX;
    }

    public void setToaDoX(double toaDoX) {
        this.toaDoX = toaDoX;
    }

    public double getToaDoY() {
        return toaDoY;
    }

    public void setToaDoY(double toaDoY) {
        this.toaDoY = toaDoY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius < 0) {
            System.out.println("Ban kinh phai lon hon 0 ");
        } else {
            this.radius = radius;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Circle(double toaDoX, double toaDoY, double radius, String color) {
        this.toaDoX = toaDoX;
        this.toaDoY = toaDoY;
        this.radius = radius;
        this.color = color;
    }

    public void render() {
        System.out.println("Toa do X la: " + this.getToaDoX() + "Toa do Y la: " + this.getToaDoY() + "Ban kinh la: " + this.getRadius());
    }

    public double calArea() {
        double dientichHinhTron;
        dientichHinhTron = this.getRadius() * this.getRadius() * 3.14;

        return dientichHinhTron;
    }

    @Override
    public String toString() {
        return "circle_cylinder.Circle{" +
                "toaDoX=" + toaDoX +
                ", toaDoY=" + toaDoY +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }



}
