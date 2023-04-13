package point2D_Poin3D;

public class main {
    public static void main(String[] args) {
//        Point2D point2D = new Point2D(2.4f,3.5f);
//        System.out.println(point2D);
//
//        Point3D point3D = new Point3D(2.7f,3.9f,5.6f);
//        System.out.println(point3D);


        Point2D point2D1 = new Point2D();
        point2D1.setXY(2.5f,3.6f);
       point2D1.disPlayGetXY(point2D1.getXY());



       Point3D point3D1 = new Point3D();
       point3D1.setXYZ(2.5f,7.8f,9.2f);
      point3D1.displayGetXYZ(point3D1.getXYZ());

    }
}
