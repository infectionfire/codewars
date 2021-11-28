/*
The Ackermann function is a famous function that played a big role in computability
theory as the first example of a total computable function that is not primitive recursive.

Since then the function has been a bit simplified but is still of good use.
Due to its definition in terms of extremely deep recursion it can be used as a benchmark
of a compiler's ability to optimize recursion.

https://www.codewars.com/kata/53ad69892a27079b34000bd9/train/java
 */


public class AckermanFunction {

        public static void main(String[] args) {
            int m=4,n=0;
            System.out.println(ackermann(m,n));
        }

        public static int ackermann(int m, int n) {

            if (m == 0){
                return (n+1);
            }
            if (n == 0) {
                return ackermann(m-1,1);
            }
            return ackermann(m-1,ackermann(m,n-1));
        }
}
