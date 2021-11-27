public class Calc {
    public static void main(String[] args) {
        int n = 11111;
        System.out.println(((n/10000)+(n/1000%10)+(n%1000/100)+(n%100/10)+(n%10)));
    }
}
