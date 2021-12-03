package d;

public class DoubleChar{
    public static String doubleChar(String s){
        String result = "";
        char[] charArr = s.toCharArray();
        for(int i = 0;i < charArr.length; i++){
            result+= charArr[i];
            result+= charArr[i];
        }
        return result;
    }
}
