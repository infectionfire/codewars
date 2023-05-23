import java.util.Arrays;

/**
 * Kevin is noticing his space run out!
 * Write a function that removes the spaces from the values and returns an array showing the space decreasing.
 * For example, running this function on the array ['i', 'have','no','space']
 * would produce ['i','ihave','ihaveno','ihavenospace']
 */

public class RunningOutOfSpace {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(spacey(new String[]{"Trying!", "Adding2", "Diff3rent", "Comb1nati0ns"})));
    }

//    public static String[] spacey(String[] array) {
//        String[] result = new String[array.length];
//        for (int i = 0 ; i<array.length;i++){
//            result[i] = builder(i,array);
//        }
//        return result;
//    }
//    public static String builder(int count, String[] array){
//        StringBuilder sb = new StringBuilder();
//        for(int i = 0; i<=count; i++){
//            sb.append(array[i]);
//        }
//        return sb.toString();
//    }

    public static String[] spacey(String[] array) {
        String[] strings = new String[array.length];
        StringBuilder str = new StringBuilder();
        int i = 0;

        for (String s : array) {
            str.append(s);
            strings[i++] = str.toString();
        }
        return strings;
    }
}
