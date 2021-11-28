/*

Roman Numerals Encoder
Create a function taking a positive integer as its parameter and returning a string
containing the Roman Numeral representation of that integer.

Modern Roman numerals are written by expressing each digit
separately starting with the left most digit and skipping any digit with a value of zero.
 In Roman numerals 1990 is rendered: 1000=M, 900=CM, 90=XC; resulting in MCMXC.
 2008 is written as 2000=MM, 8=VIII; or MMVIII. 1666 uses each Roman symbol in descending order: MDCLXVI.
 */


public class Conversion {

    public  String solution(int number) {

        String romeNum[] = {"M","XM","CM","D","XD","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int arabNum[] = {1000, 990, 900, 500, 490, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        StringBuilder result = new StringBuilder();
        int i = 0;
        while (number > 0 || arabNum.length == (i - 1)) {
            while ((number - arabNum[i]) >= 0) {
                number -= arabNum[i];
                result.append(romeNum[i]);
            }
            i++;
        }
        return result.toString();
    }
}