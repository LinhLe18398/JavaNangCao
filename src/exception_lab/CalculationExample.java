package exception_lab;

import java.util.Scanner;

public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap x: ");
        int x = scanner.nextInt();
        System.out.println("Nhap y");
        int y = scanner.nextInt();
        calculate(x,y);
    }


    private static void calculate(int x, int y){
        try{
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tong x + y = " + a);
            System.out.println("Hieu cua x - y = " + b);
            System.out.println("Tich x * y = " + c);
            System.out.println("Hieu x / y = " + d);
        } catch (Exception e){
            System.out.println("Xay ra ngoai le: " + e.getMessage());
        }
    }
}
