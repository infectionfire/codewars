package d;

public class TrafficLights {

    public static String updateLight(String current) {
        if (current.equals("green")) return "yellow";
        if (current.equals("yellow")) return "red";
        return "yellow";
    }

}