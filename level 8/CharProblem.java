/*
Ask a small girl - "How old are you?". She always says strange things... Lets help her!

For correct answer program should return int from 0 to 9.

Assume test input string always valid and may look like "1 year old" or "5 years old", etc..
 The first char is number only.
 */

import java.util.Scanner;

public class CharProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        System.out.println(howOld(str));
    }
    public static int howOld(final String herOld) {

        int value = Integer.parseInt(herOld.replaceAll("[^0-9]", ""));
        return value;
    }
}