package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {
    public static void main(String[] args) {
        String number = "9876543211";
        Pattern pattern = Pattern.compile("^[6-9]\\d{9}$");
        Matcher matcher = pattern.matcher(number);
        System.out.println(matcher.find());

    }
}
