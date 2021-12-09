import java.math.BigInteger;


public class Checkchoose {

    public static void main(String[] args) {
//        System.out.println(factorial(300));
//        System.out.println((factorial(300)).divide(factorial(1).multiply(factorial((299)))));
//        System.out.println(factorial(35));
//        System.out.println(factorial(1).multiply(factorial((34))));
//        System.out.println(BigInteger.valueOf(3333));
        System.out.println(checkchoose(33,30));

    }


    public static BigInteger factorial( long n){
        BigInteger result =BigInteger.ONE;
        for (int i=1; i<=n; i++){
            result=result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static int factorialRecursion(int n){
        int result;


        if (n == 1)
            return 1;
        result = factorialRecursion(n - 1) * n;
        return result;
    }

    public static long checkchoose(long m, int n){

        for (int i=1; i<=n; i++){
            BigInteger m222=(factorial(i)).multiply(factorial((n - i)));
            System.out.println(m222);
            BigInteger m1= (factorial(n)).divide(m222);


            if(m1.compareTo(BigInteger.valueOf(m))==0) {
                return i;
            }
        }

        return -1;
    }
}