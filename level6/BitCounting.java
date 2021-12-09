/*
https://www.codewars.com/kata/526571aae218b8ee490006f4/train/java
Bit Counting
 */

package d;

public class BitCounting {
    public static int countBits(int n){
        String num = Integer.toBinaryString(n);
        String[] check = num.split("");
        int count = 0;
        for(int i =0;i<check.length; i++){
            if (check[i].equals(1)){
                count++;
            }
        }
        return count;
        //return Integer.bitCount(n); или так
    }
}
