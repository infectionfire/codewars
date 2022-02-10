/*
Sum without highest and lowest number
https://www.codewars.com/kata/576b93db1129fcf2200001e6/java
 */

import java.util.Arrays;

public class SumMaxAndMinNums {

    public static int sum(int[] numbers) {
        if(numbers == null || numbers.length < 2) return 0;
        Arrays.sort(numbers);
        return Arrays.stream(numbers).skip(1).limit(numbers.length-2).sum();
    }
}
