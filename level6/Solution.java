package d;

public class Solution {
    public static int sequence(int n) {
        int[] arr = {0, 1, 1, 2, 0, 2, 2, 1};
        return arr[(n-1)%8];
    }
}


