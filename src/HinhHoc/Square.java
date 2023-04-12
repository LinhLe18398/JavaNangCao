package HinhHoc;

public class Square extends Rechtangle{

    // lop Square la lop con cua lop Rechtangle va khong co them thuoc tinh moi

    //tao constructor khong tham so va constructor co tham so la side
    public Square() {
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    // tao getter setter
    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    // ghi de phuong thuc getter setter cua Width de thay doi gia tri cua width
    @Override
    public void setWidth(double width) {
        setSide(width);
    }

    //
    @Override
    public void setLength(double length) {
        setSide(length);
    }

    @Override
    public String toString() {
        return "A Square with side="
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }

}
