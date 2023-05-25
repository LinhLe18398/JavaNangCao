package Regular_Expression;

public class EmailExampleTest {
    private static Email_Example emailExample;
    public static final String[] validEmail = new String[]{"a@gmail.com", "ab@yahoo.com", "abc@hotmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "ab@gmail.", "@#abc@gmail.com"};

    public static void main(String[] args) {
        Email_Example emailExample1 = new Email_Example();
        for (String email : validEmail) {
            boolean isvalid = emailExample1.validate(email);
            System.out.println("Email " + email + " hop le " + isvalid);
        }

        for (String email: invalidEmail) {
            boolean isvalid = emailExample1.validate(email);
            System.out.println("Email " + email + " khong hop le " + isvalid);
        }
    }
}
