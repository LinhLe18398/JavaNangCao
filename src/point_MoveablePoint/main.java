package point_MoveablePoint;

public class main {
    public static void main(String[] args) {
//        Point point = new Point();
//        point.setXY(2.6f,3.9f);
//        point.displayGetXY(point.getXY());



        MovablePoint movablePoint1 = new MovablePoint();
        movablePoint1.setXY(1f,2f);
        movablePoint1.setSpeed(2.3f,3.6f);
        System.out.println(movablePoint1.move());
    }
}
