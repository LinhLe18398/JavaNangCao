package abstract_shape;

public class main {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(2,5);
        System.out.println(rectangle1.getArea());
        System.out.println(rectangle1.getPerimeter());
        System.out.println(rectangle1);

        Shape rechtangle2 = new Rectangle(4,6);
        System.out.println(rechtangle2.getArea());
        System.out.println(rechtangle2);
    }
}
