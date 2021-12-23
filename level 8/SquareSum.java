/*
Square(n) Sum
https://www.codewars.com/kata/515e271a311df0350d00000f/train/java
 */

public class SquareSum {
    public static int squareSum(int[] n)
    {
        int sum = 0;
        for (int num: n){
            sum+=(num*num);
        }
        return sum;
    }
}
