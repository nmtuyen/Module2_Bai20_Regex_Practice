package baitap_Check_PhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;
    public static final String PHONE_NUMBER = "^[(]\\d{2}[)][-][(][0]\\d{9}[)]$";
    public PhoneNumber(){
        pattern = Pattern.compile(PHONE_NUMBER);
    }
    public boolean validate(String regex){
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
