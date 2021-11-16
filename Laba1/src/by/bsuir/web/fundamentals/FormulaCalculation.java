package by.bsuir.web.fundamentals;

import static java.lang.Math.*;

public class FormulaCalculation {
    public static double Calculate(double x, double y){
        double nominator = 1 + pow(sin(x + y), 2);
        double denominator = 2 + abs(x - 2 * x / (1 + pow(x, 2) * pow(y, 2)));

        return nominator / denominator + x;
    }

    public static void main(String[] args) {
        double x = 18.75;
        double y = 2.84;

        double result = Calculate(x, y);
        System.out.println(result);
    }
}
