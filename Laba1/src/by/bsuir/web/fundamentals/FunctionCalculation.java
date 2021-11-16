package by.bsuir.web.fundamentals;

import static java.lang.Math.*;

public class FunctionCalculation {
    public static void Calculate(double a, double b, double h){
        double x = a;
        while (Double.compare(x, b) <= 0){
            double y = tan(x);

            System.out.print("x = " + x + "  ");
            System.out.println("y = " + y);

            x += h;
        }
    }

    public static void main(String[] args) {
        double a = 1;
        double b = 9;
        double h = 1;

        Calculate(a, b, h);
    }
}
