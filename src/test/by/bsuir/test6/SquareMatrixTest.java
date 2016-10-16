package test.by.bsuir.test6;

import by.bsuir.task6.SquareMatrixMaker;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class SquareMatrixTest {
    private double[] arrayExample = {1.0, 2.0, 3.0, 4.0, 5.0};
    private SquareMatrixMaker matrixMk = new SquareMatrixMaker(arrayExample);
    private final double  DELTA = 0.00001;

    @Test
    public void getSquareMatrixTest(){
        double[][] matrix = matrixMk.getSquareMatrix();
        double[][] expectedMatrix = {
            {1.0, 2.0, 3.0, 4.0, 5.0},
            {2.0, 3.0, 4.0, 5.0, 1.0},
            {3.0, 4.0, 5.0, 1.0, 2.0},
            {4.0, 5.0, 1.0, 2.0, 3.0},
            {5.0, 1.0, 2.0, 3.0, 4.0}
        };

        for (int i = 0; i < expectedMatrix.length; i++){
            assertArrayEquals(expectedMatrix[i], matrix[i], DELTA);
        }


    }

}