package d;

public class ExpressionsMatter {
    public static void main(String[] args) {
        System.out.println(expressionsMatter(1,1,1));
    }

    public static int expressionsMatter(int a, int b, int c) {
        int itVar = 0;
        int[] nums2 = {(a * (b + c)), (a * b * c), (a + b * c), ((a + b) * c), (a+b+c)};
        for(int i=0; i < nums2.length;i++){
            if (itVar <= nums2[i]){
                itVar=nums2[i];
            }
        }

        return itVar;
    }
}
