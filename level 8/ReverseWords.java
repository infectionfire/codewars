import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseWords{

    public static void main(String[] args) {
        System.out.println(reverseWords("I like eating"));
    }
    public static String reverseWords(String str){
        //write your code here...
        String[] strArr = str.split(" ");
        List<Object> list = Arrays.asList(strArr);
        Collections.reverse(list);
        String reverse= "";
        for (int i = 0; i< strArr.length;i++){
            if(i< strArr.length-1){
            reverse+=reverse.valueOf(strArr[i]+" ");
            }else{            reverse+=reverse.valueOf(strArr[i]);}
        }
        return reverse;
    }
}