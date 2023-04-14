package shape;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double side1, side2, side3;

        while (true) {
            System.out.println("Nhap side 1: ");
            side1 = scanner.nextDouble();
            System.out.println("Nhap side 2: ");
            side2 = scanner.nextDouble();
            System.out.println("Nhap side 3: ");
            side3 = scanner.nextDouble();
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                break;
            } else {
                System.out.println("day khong phai la tam giac");
            }
        }

        System.out.println("Nhap mau sac cua tam giac: ");
        String color = scanner.next();

        Triangle triangle = new Triangle(side1, side2, side3, color);
        System.out.println(triangle);

    }
}
