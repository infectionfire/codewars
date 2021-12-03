package d;

import java.util.Arrays;

public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, result, 0,  arr1.length);
        System.arraycopy(arr2, 0, result, arr1.length, arr2.length);
        int sum =0;
        for(int i=0; i<result.length;i++){
            sum+=result[i];
        }
        return sum;
    }

}