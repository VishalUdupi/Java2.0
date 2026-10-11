package DSA2.O;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class Test2 {
    public static void main(String[] args) {
        List<List<Integer>> arr = List.of(List.of(1,2),List.of(3,4));
        List<Integer> result = arr.stream()
                .flatMap(List::stream)
                        .toList();

                /*IntStream.rangeClosed(Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt())
                        .filter(i -> Arrays.stream(arr).noneMatch(n -> n == i))
                        .boxed()
                        .toList();*/
        System.out.println(result.toString());


    }
}
