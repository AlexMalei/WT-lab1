package by.bsuir.task3;

import java.util.HashMap;


public class Function {
    public HashMap<Double, Double> calculateFunction(double beginSection, double endSection, double step) throws Exception {
        checkArguments(beginSection, endSection, step);
        HashMap<Double, Double> functionResults = new HashMap<>();
        while (beginSection <= endSection){
            functionResults.put(beginSection, calculateCurrentValue(beginSection));
            beginSection += step;
        }
        return functionResults;
    }
    private static void checkArguments(double beginSection, double endSection, double step) throws Exception {
        if ((endSection < beginSection) || (step <= 0)){
            throw new Exception("Illegal section arguments");
        }
    }

    private double calculateCurrentValue(double var){
        return Math.tan(var);
    }



}
