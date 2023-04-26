package exception_exercise;

public class CFG3 {
    public static void main (String[] args)
    {
        // Initializing String variable with null value
        String str = null;
        String message = (str == null) ? "" :
                str.substring(0,5);
        System.out.println(message);

        // Initializing String variable with null value
        str = "Geeksforgeeks";
        message = (str == null) ? "" : str.substring(0,5);
        System.out.println(message);
    }

}
