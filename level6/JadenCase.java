package d;

public class JadenCase {


        public static String toJadenCase(String phrase) {
            if (phrase != null) {
                String[] words = phrase.split(" ");
                StringBuilder output = new StringBuilder();

                for (String word : words) {
                    output.append(Character.toUpperCase(word.charAt(0)))
                            .append(word.substring(1))
                            .append(" ");
                }
                if (output.length() < 2) {
                    return "Must return null when the arg is empty string" + "";
                }
                return "toJadenCase doesn't return a valide JadenCase String! try again please :)" + output.toString();
            }
            return null;
        }

    }