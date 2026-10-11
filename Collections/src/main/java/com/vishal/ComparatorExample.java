package com.vishal;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class StringLenCompare implements Comparator<String> {
    public int compare(String o1, String o2) {
        return o2.length() - o1.length();
    }
}

public class ComparatorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Vishal");
        list.add("Someone");
        list.add("SomeoneElse");

        list.sort(new StringLenCompare());
        System.out.println(list);
    }
}
