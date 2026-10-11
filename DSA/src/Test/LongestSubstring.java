package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LongestSubstring {

    public static List<String> longestsubStr(String s){

        List<String> stringList = new ArrayList<>();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            for(int j = i+1; j < s.length(); j++){
                res = s.substring(i,j);
                stringList.add(res);
            }
        }

        return Collections.singletonList(stringList.toString());


    }

    public static void main(String[] args) {
        String s = "Vishalsagar";
        System.out.println(longestsubStr(s));
    }

}
