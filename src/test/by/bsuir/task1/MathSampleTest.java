package test.by.bsuir.task1;

import by.bsuir.task1.MathSample;
import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class MathSampleTest {
    private MathSample mathSample = null;
    private static final double DELTA = 0.0001;
    private double valueX;
    private double valueY;
    private double expectedResult;

    @Before
    public void setUp() throws Exception {
        mathSample = new MathSample();
    }

    public MathSampleTest(double valueX, double valueY, double expectedResult){
        this.valueX = valueX;
        this.valueY = valueY;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static List<Double[]> evaluateTestDataArray(){
        return Arrays.asList(new Double[][]{
                {0.0, 0.0, 0.5},
                {1.0, 1.0, 1.91341},
                {1.87, 3.14, 2.4035},
                {25.3, -69.2, 25.3368},
                {-2.0, 2035.0, -1.696}
        });
    }


    @Test
    public void calculationTest(){
        try{
            double actualResult = mathSample.calculation(valueX, valueY);
            assertEquals(expectedResult, actualResult, DELTA);
        }
        catch (Exception e){
            Assert.fail("Method throw uncatched exception");
        }
    }


}