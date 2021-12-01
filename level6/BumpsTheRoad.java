package d;

public class BumpsTheRoad {
    public static String bumps(final String road) {
        int count = 0;
        String[] strings = road.split("");
        for (int i=0; i< strings.length; i++){
            if (strings[i].equals("n")){
                count++;
            }
        }


        return (count)<=15? "Woohoo!":"Car Dead";
    }
}
