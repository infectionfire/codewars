/*
Flatten and sort an array
https://www.codewars.com/kata/57ee99a16c8df7b02d00045f/java
 */

import java.util.Arrays;

public class FlattenAndSort {

    public static int[] flattenAndSort(int[][] array)  {

        return Arrays.stream(array).flatMapToInt(Arrays::stream).sorted().toArray();
    }

    public static void main(String[] args) {
        int[] n = flattenAndSort(new int[][] {{111, 999}, {222}, {333}, {444}, {888}, {777}, {666}, {555}});
        System.out.println(Arrays.toString(n));
    }
}
