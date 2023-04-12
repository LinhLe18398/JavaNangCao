public class Cau2 {
    public static void main(String[] args) {
        int diemThi[] = {7, 8, 9, 15, 3, 5, 6};
        findMaxScore(diemThi);
    }

    public static int findMaxScore(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Diem thi cao nhat la: " + max);
        return max;
    }
}
