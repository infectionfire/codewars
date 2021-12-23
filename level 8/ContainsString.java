/*
All Star Code Challenge #18
https://www.codewars.com/kata/5865918c6b569962950002a1/train/java
 */

public class ContainsString {
    public static int strCount(String str, char letter) {
        return (int)str.chars().filter(x -> x == letter).count();
    }
}
