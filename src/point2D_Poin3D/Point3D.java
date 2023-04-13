package point2D_Poin3D;

public class Point3D extends Point2D {
    private float z;

    public Point3D(){
        super();
        z = 0.0f;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D(float z) {
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
       setXY(x, y);
       this.z = z;
    }

    public float[] getXYZ() {
        float array[] = new float[3];
        array[0] = getX();
        array[1] = getY();
        array[2] = getZ();
        return array;
    }

    public void displayGetXYZ(float array[]){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    @Override
    public String toString() {
        return "Point3D{" +
                super.toString() +
                "z=" + z +
                '}';
    }
}
