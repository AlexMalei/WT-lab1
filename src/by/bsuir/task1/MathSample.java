package by.bsuir.task1;

import static java.lang.Math.*;

public class MathSample {

    public double calculation(double x, double y){
        double numerator = 1 + pow(sin(x + y), 2);
        double denominator = 2 + abs(x - (2 * x) / (1 + pow(x, 2) * pow(x, 2)));
        return numerator / denominator + x;
    }

    public static void main(String[] args) {
        MathSample sample = new MathSample();
        System.out.println(sample.calculation(10, -10));
    }
}
