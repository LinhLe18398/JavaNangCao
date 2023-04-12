public class AppCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2,3,3.5,"red");
        circle1.setColor("blue");
        circle2.setColor("yellow");
        System.out.println("toa do X cua hinh tron la: " + circle1.getToaDoX() + "Toa do Y cua hinh tron la: " + circle1.getToaDoY());
        System.out.println("toa do X cua hinh tron la: " + circle2.getToaDoX() + "Toa do Y cua hinh tron la: " + circle2.getToaDoY());
        circle1.calArea();
        circle2.calArea();
        System.out.println(circle2.calArea());
        circle2.setRadius(-1);
        System.out.println(circle2.getRadius());







    }

}
