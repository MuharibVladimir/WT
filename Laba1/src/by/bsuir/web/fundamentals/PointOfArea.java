package by.bsuir.web.fundamentals;

import static java.lang.Math.*;

public class PointOfArea {
    public static boolean CheckIsPointInArea(double x, double y){
        if ((abs(x) > 6) || (y < -3) || (y > 5)){
            return false;
        }
        if ((y <= 0) || (abs(x) <= 4)){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        double x = 6;
        double y = 5;

        boolean isPointInArea = CheckIsPointInArea(x, y);
        System.out.println(isPointInArea);
    }
}
