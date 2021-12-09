import java.math.BigInteger;
import java.util.*;

public class Oddity {

    public static String oddity(BigInteger bigN) {
        BigInteger sqrt = bigN.abs().sqrt();
        return sqrt.multiply(sqrt).equals(bigN.abs()) ? "odd" : "even";

    }
}