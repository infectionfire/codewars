/*
String Merge!
https://www.codewars.com/kata/597bb84522bc93b71e00007e/train/java
 */


public class StringMerge {
    public static String stringMerge(String s1, String s2, char letter) {
        int index1 = s1.indexOf(letter);
        int index2 = s2.indexOf(letter);

        return s1.substring(0,index1)+s2.substring(index2);
    }

    public static void main(String[] args) {
        System.out.println(stringMerge("apowiejfoiajsf","iwahfeijouh", 'j'));
    }
}
