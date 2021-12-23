/*
altERnaTIng cAsE <=> ALTerNAtiNG CaSe
https://www.codewars.com/kata/56efc695740d30f963000557/train/java
 */


import static java.lang.Character.*;

public class StringUtils {
    public static String toAlternativeString(String string) {
        return string.chars()
                .map(c -> isUpperCase(c) ? toLowerCase(c) : isLowerCase(c) ? toUpperCase(c) : c)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
