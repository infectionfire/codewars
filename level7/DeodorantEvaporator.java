/*
Deodorant Evaporator
https://www.codewars.com/kata/5506b230a11c0aeab3000c1f/train/java
 */

public class DeodorantEvaporator {


    public static int evaporator(double content, double evap_per_day, double threshold) {
        double current = content;
        int count = 0;
        while (current >= content*threshold/100.0){
            current = current * (1 - evap_per_day/100.0);
            count += 1;
        }
        return count;
    }
}
