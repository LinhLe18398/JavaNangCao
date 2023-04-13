package shape;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap side 1: ");
        double side1 = scanner.nextDouble();
        System.out.println("Nhap side 2: ");
        double side2 = scanner.nextDouble();
        System.out.println("Nhap side 3: ");
        double side3 = scanner.nextDouble();
        System.out.println("Nhap mau sac cua tam giac: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3, color);
        System.out.println(triangle);

    }
}
