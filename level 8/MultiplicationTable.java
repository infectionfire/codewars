/*
https://www.codewars.com/kata/5a2fd38b55519ed98f0000ce/train/java
Multiplication table for number
 */

public class MultiplicationTable {
    public static String multiTable(int num) {
        String table = "";

        for (int i = 1; i< 11; i++){
            if (i != 10){
                table+=(i+" * "+num+" = "+num*i+"\n");
            }else{
                table+=(i+" * "+num+" = "+num*i);
            }
        }
        return table; // good luck
    }
}
