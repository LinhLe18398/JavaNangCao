package Regular_Expression;

import java.util.Scanner;

public class CheckPhoneNumber {
    public static boolean isValidPhoneNumber(String phoneNumber){
         String regex = "^\\(\\d{2}\\)-\\(\\d{10}\\)$";
         return phoneNumber.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so dien thoai can kiem tra");
        String phoneNumber = scanner.nextLine();
        System.out.println(isValidPhoneNumber(phoneNumber));
    }
}
