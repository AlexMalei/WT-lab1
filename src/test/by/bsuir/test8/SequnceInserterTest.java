package test.by.bsuir.test8;

import by.bsuir.task8.SequnceInserter;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class SequnceInserterTest {

    @Test
    public void sequenceInserterTest(){
        int[] result = SequnceInserter.getInsertIndexes(new double[]{ 1,3,4,5,6}, new double[]{1,3,5,325,245,5});
        assertArrayEquals(new int[]{0, 2, 5, 8, 8, 8}, result);
    }

}