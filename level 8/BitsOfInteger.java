/*
Write a function that reverses the bits in an integer.

For example, the number 417 is 110100001 in binary. Reversing the binary is 100001011 which is 267.

You can assume that the number is not negative.
 */


public class BitsOfInteger {

    public static int reverse_bits(int n) {

        int b = 0;
        while (n != 0)
        {
            //побитовый сдвиг
            b <<= 1;
            b |= ( n & 1);
            n >>= 1;
        }
        return b;

    }
}