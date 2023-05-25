package TestFirday;

public class Test1 {
    public static void modify(int x, int y){
        x = 100;
        y = 200;
        System.out.println("X - Y from modify: " + x + " - " + y);
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        System.out.println("X -Y before modify: " + x + " - " + y);
        modify(4,5);
        System.out.println("X - Y after modify: " + x + " - " + y);
    }
}
