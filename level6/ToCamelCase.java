package d;

/**Reversed sequence
 *
 * Complete the method/function so that it converts dash/underscore delimited words into camel casing. The first word within the output should be capitalized only if the original word was capitalized (known as Upper Camel Case, also often referred to as Pascal case).
 *
 * Examples
 * "the-stealth-warrior" gets converted to "theStealthWarrior"
 * "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
 */
public class ToCamelCase {

    public static void main(String[] args) {
        System.err.println(toCamelCase("The_Stealth_Warrior"));
    }
//    static String toCamelCase(String s){
//        return String.join("", Arrays.stream(s.split("[^A-Za-z]")).map(x -> x.substring(0, 1).toUpperCase() + x.substring(1).toLowerCase())  .collect(Collectors.joining()));
//    }

    static String toCamelCase(String s){

        StringBuilder sb = new StringBuilder();
        Boolean subs = false;
        for (int i=0; i<s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                char tmp = s.charAt(i);
                if (subs) tmp = Character.toUpperCase(tmp);
                sb.append(tmp);
                subs = false;

            } else {
                subs = true;
            }
        }
        return sb.toString();
    }

}
