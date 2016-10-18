package test.by.bsuir.test5;

import by.bsuir.task5.Sequence;
import org.junit.Test;

import static org.junit.Assert.*;

public class SequenceTest {

    private Sequence sequence;


    @Test
    public void testSimpleArray(){
        sequence = new Sequence(new int[]{7, 2, 3, 5, 4, 6, 8, 1, 3});
        assertEquals(sequence.getCountOfThrowingElements(), 4);
    }

    @Test
    public void testIncreasingArray(){
        sequence = new Sequence(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
        assertEquals(sequence.getCountOfThrowingElements(), 0);
    }

    @Test
    public void testDecreasingArray(){
        sequence = new Sequence(new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0});
        assertEquals(sequence.getCountOfThrowingElements(), 10);
    }
}