/**
 * write me a function stringy that takes a size and returns a string of alternating 1s and 0s.
 * the string should start with a 1.
 * a string with size 6 should return :'101010'.
 * with size 4 should return : '1010'.
 * with size 12 should return : '101010101010'.
 * The size will always be positive and will only use whole numbers.
 */

public class StringyStrings {
    public static String stringy(int size) {
        StringBuilder num = new StringBuilder("");
        for (int i = 0; size > i; i++) {
            if (i % 2 == 0) {
                num.append("1");
            } else {
                num.append("0");
            }
        }
        return num.toString();
    }

}
