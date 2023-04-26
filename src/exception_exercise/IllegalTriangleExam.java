package exception_exercise;

import java.util.Scanner;

public class IllegalTriangleExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh thu nhat: ");
        float a = scanner.nextFloat();
        System.out.println("Nhap canh thu hai: ");
        float b = scanner.nextFloat();
        System.out.println("Nhap canh thu ba: ");
        float c = scanner.nextFloat();
        try {
            if (a <= 0 || b <= 0 || c <= 0) {
                throw new IllegalTriangleException("Cac canh phai lon hon 0");
            }

            if (a + b <= c || a + c <= b || b + c <= a) {
                throw new IllegalTriangleException("Tong 2 canh phai lon hon canh con lai");
            }

        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }

}
