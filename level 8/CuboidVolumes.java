public class CuboidVolumes {
    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        //your code here !!
        return Math.abs(firstCuboid[0]+firstCuboid[1]+firstCuboid[2]-secondCuboid[0]-secondCuboid[2]-secondCuboid[1]);
    }
}