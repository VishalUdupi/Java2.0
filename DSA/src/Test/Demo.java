package Test;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class Demo {
    static void main(String[] args) {
//        Integer i = 10;
//        int j = i.intValue();
//        List<Integer> list = List.of(10,20,30);
//        Integer[] array = list.toArray(Integer[]::new);
//        System.out.println(j);
        List<String> stringList = List.of("apple", "banana");
        //List<String> list = new CopyOnWriteArrayList<>(stringList);
        //System.out.println(list);
        for (String s: stringList){
            System.out.println(stringList);
            stringList.add("orange");
        }
        //System.out.println(list);
    }
}
