/*
https://www.codewars.com/kata/5b1cd19fcd206af728000056/train/java
Which x for that sum?
 */

public class Solve {

    public static double solve(double m) {
        double number = 1 + (0.5 - Math.sqrt(0.25 + m)) / m;
        return number;
    }
}