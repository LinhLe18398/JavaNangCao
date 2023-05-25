package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameCheck {
    public static boolean isValidClassName(String className){
        // Kiểm tra chiều dài của tên lớp học
        if (className.length() != 8) {
            return false;
        }

        // Kiểm tra ký tự đầu tiên phải là chữ hoa C hoặc A hoặc P
        char firstChar = className.charAt(0);
        if (firstChar != 'C' && firstChar != 'A' && firstChar != 'P'){
            return false;
        }

        // Kiểm tra các ký tự phía sau phải là số
        String number = className.substring(1,5);
        try {
            Integer.parseInt(number);
        }catch (NumberFormatException e){
            return false;
        }

        // Kiểm tra ký tự cuối cùng phải là chữ hoa G hoặc H hoặc I hoặc K
        char lastChar = className.charAt(7);
        if (lastChar != 'G' && lastChar != 'H' && lastChar != 'I' && lastChar != 'K'){
            return false;
        }

        //kiểm tra các kí tự còn lại không được phép là kí tự đặc biệt
        String regex = "[^a-zA-Z0-9]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(className.substring(0,7));
        if (matcher.find()){
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap ten lop can kiem tra: ");
        String str = scanner.nextLine();
        if (isValidClassName(str)){
            System.out.println("ten lop hop le");
        } else {
            System.out.println("ten lop ko hop le");
        }
        scanner.close();
    }
}
