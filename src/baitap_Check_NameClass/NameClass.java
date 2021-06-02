package baitap_Check_NameClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClass {

    public static final String REGEX_NAME_CLASS = "^[CAP][0-9]{4}[GHIKLM]$";

    public NameClass() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(REGEX_NAME_CLASS);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}
