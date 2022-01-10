/*
https://www.codewars.com/kata/566dc566f6ea9a14b500007b/java
Filtering even numbers (Bug Fixes)
 */


import java.util.ArrayList;
import java.util.List;

public class Kata13December {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers) {
        List<Integer> listOfNumbers1 = new ArrayList<>();
        for (int i = 0; i < listOfNumbers.size(); i++) {

            if ((listOfNumbers.get(i)) % 2 != 0) {
                listOfNumbers1.add(listOfNumbers.get(i));
            }
        }
        return listOfNumbers1;
    }
}