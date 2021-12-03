package d;

public class Geometry{
    public static double squareArea(double A){
        double len = A*4;
        double lenSq = len/(Math.PI*2);
        double roundOff = (double) Math.round(lenSq*lenSq * 100) / 100;
        return roundOff;
    }
}