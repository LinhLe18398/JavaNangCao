package exception_lab;

import java.util.Random;

public class ArrayExample {
    public int[] createRandom(){
        Random rd = new Random();
        int [] arr = new int[100];
        System.out.println("Danh sach cac phan tu cua mang: ");
        for (int i = 0; i < 100; i++){
            arr[i] = rd.nextInt();
            System.out.println(arr[i] + "\n ");
        }
        return arr;
    }
}
