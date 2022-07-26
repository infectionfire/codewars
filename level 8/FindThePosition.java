/**
 * When provided with a letter, return its position in the alphabet.
 *
 * Input :: "a"
 *
 * Ouput :: "Position of alphabet: 1"
 */



public class FindThePosition {

    public static String position(char alphabet){
        return String.valueOf((((int) alphabet)-96)>0?((int) alphabet-96):((int) alphabet-64));
    }

    public static void main(String[] args) {
        System.out.println(position('l'));
    }
}
