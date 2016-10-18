package test.by.bsuir.test3;

import by.bsuir.task3.Function;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class FunctionTest {
    private double beginSection;
    private double endSection;
    private double step;
    private static HashMap<Double, Double> correctValues = new HashMap<>();
    private final static double DELTA = 0.0001;
    static {
        correctValues.put(0.0, 0.0);
        correctValues.put(Math.PI / 6, 1 / Math.sqrt(3) );
        correctValues.put(Math.PI / 3, Math.sqrt(3));
        correctValues.put(2 * Math.PI / 3, - Math.sqrt(3));
    }

    public FunctionTest(double beginSection, double endSection, double step){
        this.endSection = endSection;
        this.beginSection = beginSection;
        this.step = step;
    }

    @Parameters
    public static List<Double[]> setUpWrongArgumentsValues(){
        return Arrays.asList(new Double[][]{
                {2.0, 3.0, 0.0},
                {2.0, 1.9, 0.2},
                {2.0, 3.0, -0.2}
        });
    }

    @Test(expected = Exception.class)
    public void calculateWrongArguments() throws Exception {
        Function function = new Function();
        function.calculateFunction(beginSection, endSection, step);
    }

    @Test
    public void calculateCorrectArguments() throws Exception {
        Function function = new Function();
        HashMap<Double, Double> actualResults = function.calculateFunction(0, Math.PI, Math.PI / 6);

        for (HashMap.Entry entry : correctValues.entrySet()){
            double expected = (Double) entry.getValue();
            double actual = actualResults.get(entry.getKey());
            assertEquals(expected, actual, DELTA );
        }
    }

}