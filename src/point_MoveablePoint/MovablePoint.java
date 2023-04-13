package point_MoveablePoint;

public class MovablePoint extends Point{
    private float xSpeed;
    private float ySpeed;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(){
        super();
        xSpeed = 0.0f;
        ySpeed = 0.0f;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float [] getSpeed(){
        return new float[]{getxSpeed(),getySpeed()};
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ", x = " + getX() +
                ", y =" + getY() +
                '}';
    }

    public MovablePoint move(){
        setX(getX() + getxSpeed());
        setY(getY() + getySpeed());
        return this;
    }


}
