package d;

public class TwiceAsOld{


    public static void main(String[] args) {
        System.out.println(TwiceAsOld(45,30));
    }
    public static int TwiceAsOld(int dadYears, int sonYears){



        return Math.abs(dadYears - 2 * sonYears);
    }

}