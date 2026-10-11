package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StartEnd {
    public static void main(String[] args) {
        String number = "JavadsjfhaskdjfhasDeveloper";
        Pattern pattern = Pattern.compile("^[Java][Developer]$");
        Matcher matcher = pattern.matcher(number);
        System.out.println(matcher.find());
    }
}
