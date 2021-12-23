/*
https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
The Feast of Many Beasts
 */


public class TheFeastOfManyBeasts {

    public static boolean feast(String beast, String dish) {

        return (beast.charAt(0)==dish.charAt(0)&&beast.charAt(beast.length()-1)==dish.charAt(dish.length()-1));

    }

}
