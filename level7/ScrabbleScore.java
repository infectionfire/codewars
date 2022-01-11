/*
Scrabble Score
https://www.codewars.com/kata/558fa34727c2d274c10000ae/java
 */

import java.util.ArrayList;
import java.util.List;

public class ScrabbleScore {
    public static int scrabbleScore(String word) {
        //solution
        int count = 0;
        List<String> oneArr = List.of(new String[]{"A", "E", "I", "O", "U", "L", "N", "R", "S", "T"});
        List<String> twoArr = List.of(new String[]{"D", "G"});
        List<String> threeArr = List.of(new String[]{"B", "C", "M", "P"});
        List<String> fourArr = List.of(new String[]{"F", "H", "V", "W", "Y"});
        List<String> fiveArr = List.of(new String[]{"K"});
        List<String> eightArr = List.of(new String[]{"J", "X"});
        List<String> tenArr = List.of(new String[]{"Q", "Z"});
        List<String > wordChar = new ArrayList<>();
        String[] words = word.split("\\\"");
        if(words.length==0){return 0;}
        if (words.length>1) {
            wordChar = List.of(words[1].split(""));
        }else {
            wordChar = List.of(words[0].toUpperCase().split(""));
        }
        for(String str: wordChar){

            if (oneArr.contains(str)) count+=1;
            if (twoArr.contains(str)) count+=2;
            if (threeArr.contains(str)) count+=3;
            if (fourArr.contains(str)) count+=4;
            if (fiveArr.contains(str)) count+=5;
            if (eightArr.contains(str)) count+=8;
            if (tenArr.contains(str)) count+=10;
        }
        return count;

    }
}
