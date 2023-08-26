package d;

/**
 * Write a function that takes in a string of one or more words, and returns the same string,
 * but with all five or more letter words reversed (Just like the name of this Kata).
 * Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.
 *
 * Examples:
 *
 * spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
 * spinWords( "This is a test") => returns "This is a test"
 * spinWords( "This is another test" )=> returns "This is rehtona test"
 */


import java.util.Arrays;
import java.util.List;

public class ReversedStringValuesWithCountCharBetterThanFive {

    public String spinWords(String sentence) {
        List<String> strings = Arrays.asList(sentence.split(" "));
        StringBuilder builder = new StringBuilder();
        strings.forEach(string -> {
            if (string.length() > 4) {
                builder.append(new StringBuilder(string).reverse()).append(" ");
            } else {
                builder.append(string);
            }
        });
        return builder.toString().strip();
    }
}
