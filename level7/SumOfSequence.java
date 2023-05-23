/**
 * Your task is to write a function which returns the sum of a sequence of integers.
 * <p>
 * The sequence is defined by 3 non-negative values: begin, end, step.
 * <p>
 * If begin value is greater than the end, your function should return 0.
 * If end is not the result of an integer number of steps, then don't add it to the sum. See the 4th example below.
 * <p>
 * Examples
 * <p>
 * 2,2,2 --> 2
 * 2,6,2 --> 12 (2 + 4 + 6)
 * 1,5,1 --> 15 (1 + 2 + 3 + 4 + 5)
 * 1,5,3  --> 5 (1 + 4)
 * This is the first kata in the series:
 */

public class SumOfSequence {
    public static void main(String[] args) {
        System.out.println(sequenceSum(1, 5, 3));
    }

    public static int sequenceSum(int start, int end, int step) {
        int num = 0;
        for (int i = start; i <= end; i +=step) {
            num+=i;
        }
        return num;
    }
}
