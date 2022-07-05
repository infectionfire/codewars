package d;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_diff {

    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> diff = new ArrayList<>();

        for (int num: a){
            diff.add(num);
        }

        for (int num: b){
            if(diff.contains(num)){
                diff.removeAll(Collections.singleton(num));
            }
        }
        int[] result = new int[diff.size()];
        for(int i=0; i<result.length; i++){
            result[i] = diff.get(i);
        }
        return result;
    }


//    public static int[] arrayDiff(int[] a, int[] b) {
//        return IntStream.of(a).filter(x -> IntStream.of(b).noneMatch(y -> y == x)).toArray();
//    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Array_diff.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2})));
    }
}
