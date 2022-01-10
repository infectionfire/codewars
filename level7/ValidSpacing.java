/*
Valid Spacing
https://www.codewars.com/kata/5f77d62851f6bc0033616bd8/train/java
 */


import java.util.List;

public class ValidSpacing {
    public static boolean validSpacing(String s) {
        return !(s.startsWith(" ") || s.endsWith(" ") || s.contains("  "));
    }

    public static void main(String[] args) {
        System.out.println(validSpacing("gwy   hYvq"));
    }
}
