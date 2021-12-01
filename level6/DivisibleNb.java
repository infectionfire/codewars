package d;

public class DivisibleNb {
    public static boolean isDivisible(long n, long x, long y) {
        return Math.abs(n)>=Math.abs(x*y)? true:false;
    }
}