package d;

public class PowerOfI {

    public static void main(String[] args) {
        System.out.println(pofi(3));
    }

        public static String pofi(int n) {
            int i;
            String str;
            if (n % 4 == 0) {
                i =1;
                str = Integer.toString(i);
                return str;
            }
            if ((n)%4==1){
                return "i";}
            if((n)%4==2){
                i = -1;
                str = Integer.toString(i);
                return str;
            }
            if ((n)%4==3){
                return "-i";
            }
            return null;
        }

    }
