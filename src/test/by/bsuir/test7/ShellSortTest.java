package test.by.bsuir.test7;

import by.bsuir.task7.ShellSort;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class ShellSortTest {
    private static double[] testingArray;
    private final static int COUNT_ELEMENTS = 1000;
    private final static int MAX_ELEMENT = 1000;

    @BeforeClass
    public static void setUp(){
        Random random = new Random();
        testingArray = new double[COUNT_ELEMENTS];
        for (int i = 0; i < COUNT_ELEMENTS; i++){
            testingArray[i] = random.nextDouble() * random.nextInt(MAX_ELEMENT);
        }
        testingArray = ShellSort.sort(testingArray);
    }
    @Test
    public void testSortedArray(){
        for (int i = 0; i < COUNT_ELEMENTS - 1; i++){
            assertTrue(testingArray[i] <= testingArray[i + 1]);
        }
    }

}