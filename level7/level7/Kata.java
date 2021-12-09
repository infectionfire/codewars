package level7;

public class Kata {

    public static void main(String[] args) {
        System.out.printf(generateShape(5));
    }
    public static final String generateShape(int n) {
        String str ="";
        for (int i=1;i<n+1;i++){
            str+="+";
            }
        String str1 =str;
        for (int i=1;i<n;i++){
            str1=str1+"\n"+str;
        }

        return str1;
    }
}
