/*
Codewars. Piano kata part1
1     "white"
12    "black"
42    "white"
100   "black"
2017  "white"
 */


import java.util.Scanner;

public class BlackOrWhiteKey {
    public static String blackOrWhiteKey(int keyPressCount) {

        switch ((keyPressCount - 1) % 88 % 12){
            case 0:
            case 2:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
                    return "white";
            default: return "black";
        }
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println(blackOrWhiteKey(key));
    }
    }

