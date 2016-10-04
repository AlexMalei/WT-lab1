package test.by.bsuir.task4;


import by.bsuir.task4.ArrayChecking;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayCheckingTest {

    /*   {5, 5, 5, 5, 12, 12, 12, 21, 5, 7, 13, 12, 11} -> {0, 1, 2, 3, 8, 9, 10, 12 },
       {1 , 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14 } -> {2, 4, 6, 10, 12},
       {4, 6, 8, 10, 12, -10, -124} -> {}*/
    @Test
    public void getIndexOfPrimesPositiveTest() throws Exception {
        ArrayChecking arrayChecking = new ArrayChecking(new int[]{5, 5, 5, 5, 12, 12, 12, 21, 5, 7, 13, 12, 11});
        assertArrayEquals(new Integer[]{0, 1, 2, 3, 8, 9, 10, 12 }, arrayChecking.getIndexOfPrimes());

    }
    @Test
    public void getIndexOfPrimesNegativeTest() throws Exception{
        ArrayChecking arrayChecking1 = new ArrayChecking(new int[]{4, 6, 8, 10, 12, -10, -124});
        assertArrayEquals(new Integer[]{}, arrayChecking1.getIndexOfPrimes());
    }


}