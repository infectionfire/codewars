import java.util.Arrays;

public class FirstNElems {

    public static int[] take(int[] arr, int n) {
        if (n > arr.length) return arr;
        return Arrays.stream(arr).limit(n).toArray();
    }
}
