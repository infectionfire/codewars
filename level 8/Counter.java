public class Counter {

    public static void main(String[] args) {
        Boolean[] array1 = {true,  true,  true,  false,
                true,  true,  true,  true ,
                true,  false, true,  false,
                true,  false, false, true ,
                true,  true,  true,  true ,
                false, false, null,  true };
        System.out.println(countSheeps(array1));
    }
    public static int countSheeps(Boolean[] arrayOfSheeps) {
        int sum=0;
        String[] str = new String[arrayOfSheeps.length];
        for (int i = 0;i<arrayOfSheeps.length;i++){
            str[i]=arrayOfSheeps[i].toString();
        }
        for (int i = 0;i<str.length;i++){
            if(str[i].equals("true")){
                sum++;
            }
        }

        return sum;
    }
}