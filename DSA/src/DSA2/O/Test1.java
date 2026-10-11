/*
//package DSA2.O;
//
//import java.util.*;
//import java.util.function.Function;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class Test1 {
//    public static void main(String[] args) {
////        List<String> alist = List.of("a", "b");
////        List<String> blist = List.of("c", "d");
////        List<String> rlist = alist.stream()
////                .flatMap(a -> blist.stream().map(b -> a + b))
////                .toList();
//        rlist.stream().forEach(System.out::println);
        List<String> input = List.of("a", "b", "c");
//
//// Your stream here
//        input.stream()
//                .map(x -> x.toUpperCase())
//                .collect(Collectors.toList());
//// Expected output:
//
//// ["A", "B", "C"]
//
//        List<Integer> input = List.of(1, 2, 3, 4, 5, 6);
//
//// Your stream here
//        input.stream()
//                .filter(x -> x%2 == 0)
//                .toList();
//// Expected output:
//
//// [2, 4, 6]
//
//
//        List<Integer> input = List.of(5, 11, 20, 3, 15);
//
//// Your stream here
//        input.stream()
//                .filter(x -> x > 10)
//                .count();
//
//
//        List<Integer> input = List.of(1, 1, 2, 3, 3, 4);
//
//// Your stream here
//
//        input.stream()
//                .distinct()
//                .toList();
//
//        List<String> input = List.of("cat", "apple", "banana", "ant");
//
//// Your stream here
//
//        input.stream()
//                .filter(x -> x.startsWith("a"))
//                .findFirst();
//
//
//        List<String> input = List.of("hi", "hello", "java", "ok");
//
//// Your stream here
//        input.stream()
//                .filter(x -> x.length() > 3)
//                .map(x -> x.toUpperCase())
//                .toList();
//
//        List<Integer> input = List.of(1, 2, 3, 4);
//
//// Your stream here
//        input.stream()
//                .mapToInt(x -> x*x)
//                .sum();
//
//
//        List<String> input = List.of("a", "abcd", "abc");
//
//// Your stream here
//
//        input.stream()
//                .sorted(Comparator.comparingInt(String::length))
//                .toList();
//
//
//        List<Integer> input = List.of(10, 14, 20);
//
//// Your stream here
//        input.stream()
//                .anyMatch(x -> x%7 == 0);
//
//        List<String> input = List.of("a", "bb", "cc", "ddd");
//
//// Your stream here
//        input.stream()
//                .collect(Collectors.groupingBy(String::length));
//
//
//        List<List<Integer>> input = List.of(
//                List.of(1, 2),
//                List.of(3, 4),
//                List.of(5)
//        );
//
//// Your stream here
//        input.stream()
//                .flatMap(x->x.stream())
//                .toList();
//
//        List<String> input = List.of("hello world", "java streams");
//
//// Your stream here
//        input.stream()
//                .map(x -> x.split(" "))
//                .flatMap(x-> Arrays.stream(x))
//                .toList();
//
//
//        List<String> input = List.of("java", "stream", "api");
//
//// Your stream here
//
//        input.stream()
//                .map(x->x.length())
//                .toList();
//
//        List<String> input = List.of("a", "b", "c");
//
//// Your stream here
//
//        input.stream()
//                .<String>mapMulti(
//                        (n,consumer)->{
//                            consumer.accept("item-" + n);
//                        }
//                ).toList();
//
//
//        input.stream()
//                .map(x->"item-" + x)
//                .toList();
//
//
//        List<Integer> input = List.of(1, 2, 3, 4);
//
//// Your stream here
//
//        input.stream()
//                .map(x->x%2 == 0)
//                .toList();
//
//        List<String> input = List.of("java", "code", "a");
//
//// Your stream here
//
//        input.stream()
//                .map(s->s.charAt(s.length()-1))
//                .toList();
//
//        List<Integer> input = List.of(12, 34, 5);
//
//// Your stream here
//
//        input.stream()
//                .<String>mapMulti(
//                        (n,consumer) ->{
//                            String s = String.valueOf(n);
//                            char[] ch = s.toCharArray();
//                            for (char c : ch) {
//                                consumer.accept(String.valueOf(c));
//                            }
//                            }
//                )
//                .toList();
//
//        List<Set<String>> input = List.of(
//                Set.of("a", "b"),
//                Set.of("c"),
//                Set.of("d", "e")
//        );
//
//// Your stream here
//
//        input.stream()
//                .flatMap(x -> x.stream())
//                .toList();
//
//        List<String> input = List.of("hi", "java");
//
//// Your stream here
//
//        input.stream()
//                .<String>mapMulti(
//                        (s,consumer) -> {
//                         for (char c: s.toCharArray()){
//                             consumer.accept(String.valueOf(c));
//                         }
//                        }
//                )
//                .toList();
//
//        class User {
//            String name;
//            List<String> tags;
//        }
//
//        List<User> users = List.of(
//                new User("A", List.of("java", "spring")),
//                new User("B", List.of("aws")),
//                new User("C", List.of("docker", "k8s"))
//        );
//
//// Your stream here
//
//        users.stream()
//                .flatMap(u -> u.tags.stream())
//                .toList();
//
//        List<String> input = List.of("a.txt", "b.java", "c.md");
//
//// Your stream here
//
//        input.stream()
//                .map(s -> s.substring(s.indexOf(".")+1,s.length()))
//                .toList();
//
//        List<Integer> input = List.of(2, 3, 4);
//
//// Your stream here
//
//        input.stream()
//                .reduce(1,(x,y) -> x*y);
//
//        List<Integer> input = List.of(5, 9, 2, 14, 7);
//
//// Your stream here
//
//        input.stream()
//                .reduce(Integer::max);
//
//        List<String> input = List.of("java", "hi", "stream");
//
//// Your stream here
//
//        input.stream()
//                .reduce((x,y) -> x.length()<y.length() ? x:y);
//
//        List<String> input = List.of("hi", "java", "a");
//
//// Your stream here
//
//        input.stream()
//                .map(x -> x.length())
//                .reduce(0,Integer::sum);
//
//    }
//}
*/
