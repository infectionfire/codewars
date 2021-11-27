import java.util.Scanner;


public class Sid {

    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int nb_petals = sc.nextInt();
        howMuchILoveYou(nb_petals);
    }

    public static String howMuchILoveYou(int nb_petals) {
        String[] array = new String[]{"I love you","a little","a lot","passionately","madly","not at all"};

        System.out.println(array[(nb_petals-1)%6]);
        return null;
    }
}