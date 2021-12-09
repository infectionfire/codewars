package level7;

public class ZombieSurvive {


    public static void main(String[] args) {
        System.out.println(zombieShootout(10, 9, 10));
    }

    public static String zombieShootout(int zombies, int range, int ammo) {
        String result = "";
        int distance = range * 2;
        int zombieShotMax = Math.min(distance, ammo);

        if (zombies>zombieShotMax){
            result+="You shot ";
            if(ammo>=distance){
                result+=zombieShotMax+" zombies before being eaten: overwhelmed.";
            }else{
                result +=zombieShotMax+" zombies before being eaten: ran out of ammo.";
            }
        }else{
            result += "You shot all "+zombies+" zombies.";
        }
        return result;
    }
}
