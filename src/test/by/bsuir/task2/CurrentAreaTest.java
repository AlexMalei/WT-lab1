package test.by.bsuir.task2;

import by.bsuir.task2.CurrentArea;
import by.bsuir.task2.Point;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class CurrentAreaTest {
    static CurrentArea currentArea = null;

    @BeforeClass
    public static void setCurrentArea(){
        currentArea = new CurrentArea();
    }

    @Test
    public void containsPointInFirstArea() {
        assertTrue(currentArea.containsPoint(new Point(0, 2)));
    }
    @Test
    public void containsPointInSecondArea(){
        assertTrue(currentArea.containsPoint(new Point(0, -2)));
    }
    @Test
    public void containsPointOnBorder()  {
        assertTrue(currentArea.containsPoint(new Point(-4, 3)));
    }
    @Test
    public void containsPointOutside()  {
        assertFalse(currentArea.containsPoint(new Point(10, 10)));
    }
    @Test
    public void containsPointBetweenAreas()  {
        assertTrue(currentArea.containsPoint(new Point(0, 0)));
    }
}