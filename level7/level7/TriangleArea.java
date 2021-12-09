package level7;

import java.util.Arrays;

public class TriangleArea {
    public static void main(String[] args) {
        System.out.println(tArea("\n.\n. .\n"));
    }
    public static float tArea(String tStr) {
        String[] check = tStr.split("\n");
        if (check.length<=3){return 0.5f;}
        return(((check.length-2)*(check.length-2))/2f);
    }
}
