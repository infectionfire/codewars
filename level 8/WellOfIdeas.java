/*
Well of Ideas - Easy Version
https://www.codewars.com/kata/57f222ce69e09c3630000212/train/java
 */

import java.util.Arrays;

public class WellOfIdeas {
    static String well(String[] x) {
        long count = Arrays.stream(x).filter(i -> i.equals("good")).count();
        return count > 2 ? "I smell a series!" : count > 0 ? "Publish!" : "Fail!";
    }
}
