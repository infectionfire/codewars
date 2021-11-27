/*
Write function bmi that calculates body mass index (bmi = weight / height2).

if bmi <= 18.5 return "Underweight"

if bmi <= 25.0 return "Normal"

if bmi <= 30.0 return "Overweight"

if bmi > 30 return "Obese"
 */


public class Calculate {
    public static String bmi(double weight, double height) {
        //calculate bmi index
        double bmi = weight*height*height;
        //initialize string variable
        String Strnum;

            if (bmi<=18.5) {
                Strnum = "Underweight";
            }else if (bmi<=25.0) {
                Strnum = "Normal";
            }else if (bmi<=30.0){
                Strnum = "Overweight";
            }else if (bmi > 30.0){
                Strnum = "Obese";
            }else{
                Strnum = null;
            }

            return Strnum;

    }
}