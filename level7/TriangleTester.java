/*
Is this a triangle?
https://www.codewars.com/kata/56606694ec01347ce800001b/train/java
 */

class TriangleTester{

    public static boolean isTriangle(int a, int b, int c){
        return ((a + b) > c && b + c > a && a + c > b);
    }
}