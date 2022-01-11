/*
Vowel Count
https://www.codewars.com/kata/54ff3102c1bad923760001f3/train/java
 */
import java.util.List;

public class Vowels {
    public static int getCount(String str) {
        int vowelsCount = 0;
        // your code here
        List<String> strings = List.of("a", "e", "i", "o", "u");
        List<String> listStr = List.of(str.toLowerCase().split(""));
        for(String strg: listStr){
            if (strings.contains(strg)) vowelsCount++;
        }
        return vowelsCount;
    }
}
