package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Email_Example {
    private static Pattern pattern;
    private Matcher matcher;

    private  static final String EMAIL_Regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";

    public Email_Example(){
        pattern = Pattern.compile(EMAIL_Regex);
    }

    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
