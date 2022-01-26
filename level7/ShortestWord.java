/*
Shortest Word
https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9/train/java
 */


import java.util.stream.Stream;

public class ShortestWord {
    public static int findShort(String s) {
        return Stream.of(s.split(" "))
                .mapToInt(String::length)
                .min()
                .getAsInt();
    }
}
