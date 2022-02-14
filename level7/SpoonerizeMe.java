/*
Spoonerize Me
https://www.codewars.com/kata/56b8903933dbe5831e000c76/train/java
 */


import java.util.ArrayList;
import java.util.List;

public class SpoonerizeMe {

    public static String spoonerize(String words) {
        List<String > check = new ArrayList(List.of(words.split(" ")));
        StringBuilder result = new StringBuilder();
        for(int i = 0; i<check.size();i++){
            if (i==0){
                result.append(check.get(check.size()-1).charAt(0)).append(check.get(i).substring(1));
            }
            else if (i==check.size()-1){
                result.append(" " + check.get(0).charAt(0)).append(check.get(i).substring(1));
            }else {
                result.append(" "+check.get(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(spoonerize("pack of lies"));
    }
}
