/*
Holiday VIII - Duty Free
https://www.codewars.com/kata/57e92e91b63b6cbac20001e5/train/java
 */


public class DutyFree {
    public static int dutyFree(int normPrice, int discount, int hol) {

        return hol*100/(normPrice*discount);

    }

    public static void main(String[] args) {
        System.out.println(dutyFree(12,50,1000));
    }

}
