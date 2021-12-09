public class RemoveChars {
    public static String remove(String str) {
        String result = "";
        char[] charArr = str.toCharArray();
        for (int i = 1; i<charArr.length-1; i++){
            result+=charArr[i];
        }
        return result;
    }
}

