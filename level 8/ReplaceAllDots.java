/**
 * The code provided is supposed replace all the dots . in the specified String str with dashes -
 *
 * But it's not working properly.
 *
 * Task
 * Fix the bug so we can all go home early.
 *
 * Notes
 * String str will never be null.
 *
 *   public static String replaceDots(final String str) {
 *     return str.replaceAll(".", "-");
 *   }
 *
 */

public class ReplaceAllDots {

    public static void main(String[] args) {

    }

    public static String replaceDots(final String str) {
        return str.replaceAll("\\.", "-");
    }
}
