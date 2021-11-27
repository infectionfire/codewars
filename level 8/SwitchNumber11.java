/*
When provided with a number between 0-9, return it in words.

Input :: 1

Output :: "One".

If your language supports it, try using a switch statement.
 */


import java.util.Scanner;

public class SwitchNumber11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(switchItUp(n));
    }

    public static String switchItUp(int n) {
        String Strnum;
         switch (n) {
            case 1 : Strnum = "One";
            break;
            case 2  : Strnum = "Two";
                break;
            case 3  : Strnum = "Three";
                break;
            case 4  : Strnum = "Four";
                break;
            case 5  : Strnum = "Five";
                break;
            case 6  : Strnum = "Six";
                break;
            case 7  : Strnum = "Seven";
                break;
            case 8  : Strnum = "Eigth";
                break;
            case 9  : Strnum = "Nine";
                break;
            case 0  : Strnum = "Zero";
                break;
            default : Strnum = null;
        };
        return Strnum;

        }

    }


