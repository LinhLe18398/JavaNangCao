import java.util.Scanner;

public class Cau1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so can kiem tra");
        int number = scanner.nextInt();
        isOddEvent(number);


    }

    public static boolean isOddEvent(int number) {
        boolean check = false;
        if (number % 2 == 0) {
            System.out.println("Day la so chan");
            check = true;
        } else {
            System.out.println("Day la so le ");
            check = false;
        }
        return check;
    }

}
