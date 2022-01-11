import java.util.stream.*;
public class NewAverage
{
    public static long newAvg(double[] arr, double navg)
    {
        double answer = navg * (arr.length + 1) - DoubleStream.of(arr).sum();
        if (answer < 0) {
            throw new IllegalArgumentException();
        }
        return (long) (Math.ceil(answer));
    }
}