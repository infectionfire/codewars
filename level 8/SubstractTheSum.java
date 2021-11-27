
import java.util.Scanner;

public class SubstractTheSum {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(subtractSum(n));
    }
    public static String subtractSum (int n) {

        String [] fruits =
                {"1",
                        "2",
                        "3",
                        "4",
                        "5",
                        "6",
                        "7",
                        "8",
                        "9",
                        "10",
                        "cucumber",
                        "pineapple",
                        "cucumber",
                        "orange",
                        "grape",
                        "orange",
                        "grape",
                        "apple",
                        "grape",
                        "cherry",
                        "pear",
                        "cherry",
                        "pear",
                        "kiwi",
                        "banana",
                        "kiwi",
                        "apple",
                        "melon",
                        "banana",
                        "melon",
                        "pineapple",
                        "melon",
                        "pineapple",
                        "cucumber",
                        "orange",
                        "apple",
                        "orange",
                        "grape",
                        "orange",
                        "grape",
                        "cherry",
                        "pear",
                        "cherry",
                        "pear",
                        "apple",
                        "pear",
                        "kiwi",
                        "banana",
                        "kiwi",
                        "banana",
                        "melon",
                        "pineapple",
                        "melon",
                        "apple",
                        "cucumber",
                        "pineapple",
                        "cucumber",
                        "orange",
                        "cucumber",
                        "orange",
                        "grape",
                        "cherry",
                        "apple",
                        "cherry",
                        "pear",
                        "cherry",
                        "pear",
                        "kiwi",
                        "pear",
                        "kiwi",
                        "banana",
                        "apple",
                        "banana",
                        "melon",
                        "pineapple",
                        "melon",
                        "pineapple",
                        "cucumber",
                        "pineapple",
                        "cucumber",
                        "apple",
                        "grape",
                        "orange",
                        "grape",
                        "cherry",
                        "grape",
                        "cherry",
                        "pear",
                        "cherry",
                        "apple",
                        "kiwi",
                        "banana",
                        "kiwi",
                        "banana",
                        "melon",
                        "96",
                        "97",
                        "98",
                        "99",
                        "100"};



        while ((n > 100)&&(n <= 10000)) {
            n -= ((n/10000)+(n/1000%10)+(n%1000/100)+(n%100/10)+(n%10));
            System.out.println(n);
        }

        if (n == 1) {
            return fruits[0];
        }else if(n<=100){
            return fruits[n-1];
        }else{
            return null;
        }


    }
}