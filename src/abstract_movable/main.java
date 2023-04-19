package abstract_movable;

public class main {
    public static void main(String[] args) {
        MovablePoint movablePoint1 = new MovablePoint(1,2,4,5);
        movablePoint1.moveUp();
        System.out.println(movablePoint1);
    }
}
