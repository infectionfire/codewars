import java.util.Arrays;
import java.util.stream.IntStream;

public class ReversedSequence {

    public static void main(String[] args) {
        Arrays.stream(reverse(3)).forEach(System.out::println);
    }

    public static int[] reverse(int n) {
        return IntStream.range(-n, 0).map(Math::abs).toArray();

    }
}

