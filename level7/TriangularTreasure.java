/*

Triangular Treasure
https://www.codewars.com/kata/525e5a1cb735154b320002c8/train/java
 */


public class TriangularTreasure {
    public static int triangular(int n) {
        return (n <= 0) ? 0 : n * (n + 1) / 2;
    }
}
