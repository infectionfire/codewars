/*
Waiting room
https://www.codewars.com/kata/542f0c36d002f8cd8a0005e5/train/java
 */

package level7;

public class LastChair {
    public static int lastChair(int n) {
        return (n < 3) ? n : n - 1;
    }
}
