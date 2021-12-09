import java.util.*;

public class KAta {
    public static void main(String[] args) {
        System.out.println(findLongest("The quick white fox jumped around the massive dog"));
    }

    public static int findLongest(final String str) {
    String[] spl = str.split(" ");
    int longest = 0;
    for (int i=0; i<spl.length; i++) {
        if (spl[i].length() > longest) {
            longest = spl[i].length();
        }
        }
        return longest;
    }

}
