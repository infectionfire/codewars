/*
https://www.codewars.com/kata/5dae2599a8f7d90025d2f15f/java
 */

package level7;

public class CheckNum {


    public static void main(String[] args) {
        System.out.println(consecutiveDucks(57));
    }
    public static boolean consecutiveDucks(int n) {
        int sumOfFirstIIntegers = 3;
        for (int i = 2; sumOfFirstIIntegers <= n; i++)
        {
            if (i%2 == 0 ? (n%i == i/2) : (n%i == 0))
            {
                return true;
            }
            sumOfFirstIIntegers += i + 1;
        }
        return false;
    }
}
