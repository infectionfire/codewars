public class HexToDec {

    public static void main(String[] args) {
        System.out.println(hexToDec("10"));
    }
    public static int hexToDec(final String hexString) {
        // Your code here
        return Integer.parseInt((hexString) ,16);
    }

}
