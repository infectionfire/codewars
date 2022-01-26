/*
Double Every Other
https://www.codewars.com/kata/5809c661f15835266900010a/train/java
 */

import java.util.Arrays;

public class DoubleEveryOther {
    public static int[] doubleEveryOther(int[] a){
        if (a.length<2)return a;
        int[] temp = a;
        for (int i =1;i<temp.length;i+=2){

                temp[i]*=2;
            }
        return temp;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(doubleEveryOther(new int[]{1,19,6,2,12,-3})));
    }
}
