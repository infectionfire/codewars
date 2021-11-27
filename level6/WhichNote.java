/*
Piano Kata, Part 2 https://www.codewars.com/kata/589631d24a7323d18d00016f/solutions/java
 */


import java.util.Scanner;

public class WhichNote {
    public static String whichNote(int keyPressCount) {
        String key;
        if (keyPressCount >0 && keyPressCount<=10000){
            switch ((keyPressCount-1) % 88 % 12) {

                case 0:
                    key = "A";
                    return key;
                case 1:
                    key = "A#";
                    return key;
                case 2:
                    key = "B";
                    return key;
                case 3:
                    key = "C";
                    return key;
                case 4:
                    key = "C#";
                    return key;
                case 5:
                    key = "D";
                    return key;
                case 6:
                    key = "D#";
                    return key;
                case 7:
                    key = "E";
                    return key;
                case 8:
                    key = "F";
                    return key;
                case 9:
                    key = "F#";
                    return key;
                case 10:
                    key = "G";
                    return key;
                default: key = "G#";
                    return key;
            }

        }else{
            return null;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        System.out.println(whichNote(key));
    }
}

