package exception_exercise;

public class MainMyException {
    public static void main(String[] args) {
        try {
            throw new MyException("GreeksGeeks");
        } catch (MyException ex){
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }
    }
}
