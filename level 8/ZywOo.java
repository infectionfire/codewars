/*
Enumerable Magic #25 - Take the First N Elements
https://www.codewars.com/kata/545afd0761aa4c3055001386/train/java
 */

public class ZywOo {
    public static int[] take(int[] arr, int n) {
        if (n<=0){return new int[0];}
        if(n>arr.length){return arr;}
        int[] arr1 = new int[n];
        for (int i =0; i<n; i++){
            arr1[i]=(arr[i]);
        }
        return arr1;
    }
}
