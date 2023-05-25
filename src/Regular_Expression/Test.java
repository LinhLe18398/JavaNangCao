package Regular_Expression;

import java.util.Scanner;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.matches;

public class Test {
    public static void main(String[] args) {
        //xx-xx-xxxx

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chuoi can kiem tra: ");
        String str = scanner.nextLine();
        //System.out.println(checkRegexBirthday(str));
        System.out.println(checkRegexAccount(str));

    }

    public static boolean checkRegexBirthday(String str){
        String regex = "\\d{2}\\-\\d{2}\\-\\d{4}";
        boolean ischeck = Pattern.matches(regex,str);
        return ischeck;
    }

    public static boolean checkRegexAccount(String str){
        String regex = "[a-z0-9_]{6,}";
        boolean ischeck = Pattern.matches(regex,str);
        return ischeck;
    }
}
