import java.util.Scanner;

public class Cau2 {
    public static void main(String[] args) {
        int diemthi[] = new int[5];
        for (int i = 0; i < diemthi.length; i++) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhap phan tu thu " + i);
            diemthi[i] = scanner.nextInt();
        }

        findmax(diemthi);
    }

    public static int findmax(int array[]) {

        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println("Gia tri lon nhat la: " + max);
        return max;
    }
}
