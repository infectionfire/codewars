/*
Happy Birthday
https://www.codewars.com/kata/5d65fbdfb96e1800282b5ee0/train/java
 */


import java.util.Collections;
import java.util.List;

public class HappyBirthday {

    public static int wrap(int height, int width, int length){
        List<Integer> resultList = new java.util.ArrayList<>(List.of(height, width, length));
        Collections.sort(resultList);
        resultList.forEach(System.out::println);
        return resultList.get(2)*2+resultList.get(1)*2+resultList.get(0)*4+20;
    }

    public static void main(String[] args) {
        System.out.println(wrap(17,32,11));
    }

}
