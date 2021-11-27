/*
Given a number, write a function to output its reverse digits. (e.g. given 123 the answer is 321)

Numbers should preserve their sign; i.e. a negative number should still be negative when reversed.

Examples
 123 ->  321
-456 -> -654
1000 ->    1
 */

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();


        System.out.println(reverse(num));
    }
//reverse function
public static int reverse(int number) {
        int  reversed = 0;
        //reverse cycle
        if ((number<10)&&(number>-10)){
            reversed=number;
        }else{
            for(;number != 0; number /= 10) {
                int digit = number % 10;
                reversed = reversed * 10 + digit;
            }
        }
        return reversed;
    }
}
