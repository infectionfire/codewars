package d;

/*
6 kyu
Take a Ten Minute Walk
https://www.codewars.com/kata/54da539698b8a2ad76000228/java
 */


public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        //принимаем движение за оси
            int axisX = 0, axisY = 0;
        // подсчет форич
            for (char side : walk) {
                if (side == 's') axisY--;
                if (side == 'n') axisY++;
                if (side == 'w') axisX--;
                if (side == 'e') axisX++;
            }
            //если все соблюдено, тру
            return (walk.length == 10)&&(axisX == 0) && (axisY == 0);
    }
}
