/*
Two to One
https://www.codewars.com/kata/5656b6906de340bd1b0000ac/train/java
 */


import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        return Stream.of(s1.concat(s2).split(""))
                .sorted()
                .distinct()
                .collect(Collectors.joining());
    }

}
