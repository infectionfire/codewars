/*
Find the total sum of internal angles (in degrees) in an n-sided simple polygon.
N will be greater than 2.
 */

package d;

public class AngleSum {
    public static int sumOfAngles(int n) {
        int sum;
        sum = 180*(n-2);
        return sum;
    }
}

