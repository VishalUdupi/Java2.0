package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lowercase {
    public static void main(String[] args) {
        String number = "ssadasda";
        Pattern pattern = Pattern.compile("^[a-z]+$");
        Matcher matcher = pattern.matcher(number);
        System.out.println(matcher.find());
    }
}
