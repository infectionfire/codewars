/*
When provided with a number between 0-9, return it in words.

Input :: 1

Output :: "One".

If your language supports it, try using a switch statement.
 */


import java.util.Scanner;

public class SwitchNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(switchItUp(n));
    }

    public static String switchItUp(int n) {
        String Strnum;
        Strnum = switch (n) {
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eigth";
            case 9 -> "Nine";
            case 0 -> "Zero";
            default -> null;
        };
        return Strnum;

        }

    }


