import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class LineNumbers {

    public static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<String>();
        for ( int i=1; i<lines.size()+1; i++ ) {
            result.add( String.valueOf(i)+": "+lines.get(i-1) );
        }
        return  result;
    }

    public static List<String> number2(List<String> lines) {
        AtomicInteger i = new AtomicInteger(1);
        return lines.stream().map(e -> i.getAndIncrement() + ": " + e).collect(Collectors.toList());

    }

}
