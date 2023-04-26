package exception_lab;

import java.util.Scanner;

public class TestThucHanhTryCatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try{
            System.out.println("nhap so can kiem tra ");
            int n = Integer.parseInt(scanner.nextLine());
            if (99 % n == 0) {
                System.out.println(n + " is a factor of 99");
            }
        } catch (ArithmeticException e){
            System.out.println("Arithmetic " + e);
        } catch (NumberFormatException e2){
            System.out.println("Number Format Exception " + e2);
        }
    }
}
