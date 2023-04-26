package exception_lab;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        int [] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vui long nhap chi so cua 1 phan tu bat ki: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Gia tri cua phan tu co chi so " + x + "la: " + arr[x]);
        } catch (IndexOutOfBoundsException e){
            System.out.println("chi so vuot qua gioi han cua mang");
        }
    }
}
