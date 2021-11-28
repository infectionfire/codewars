/*
kata 16+18=214
In simple terms, our method does not like the principle of carrying over numbers and just writes down every number it calculates :-)

You may assume both integers are positive integers.
 */

import java.util.Scanner;

public class SillyAdditon {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt(), num2 = sc.nextInt();
        System.out.println(addedNum(num1, num2));
    }

    static int addedNum(int num1, int num2) {
        //create new stringbuilder
        var sum = new StringBuilder();
        //do while cycle
        do {
            sum.insert(0, num1 % 10 + num2 % 10);
        } while ((num1 /= 10) + (num2 /= 10) > 0);
        return Integer.parseInt(sum.toString());
    }
}