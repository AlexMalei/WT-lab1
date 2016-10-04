package test.by.bsuir.task9;

import by.bsuir.task9.Ball;
import by.bsuir.task9.Basket;
import by.bsuir.task9.Color;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BasketTest {

    private static Basket basket;
    private static final double DELTA = 0.0001;

    @BeforeClass
    public static void setUpBasket(){
        basket = new Basket(new ArrayList<Ball>());

        basket.addBall(new Ball(Color.BLACK, 1.1));
        basket.addBall(new Ball(Color.YELLOW, 2.2));
        basket.addBall(new Ball(Color.GREEN, 3.3));
        basket.addBall(new Ball(Color.BLUE, 4.4));
        basket.addBall(new Ball(Color.BLUE, 5.5));
        basket.addBall(new Ball(Color.BLUE, 6.6));
    }

    @Test
    public void countBallsTest(){
        assertEquals(3, basket.getCountBlueBalls());
    }

    @Test
    public void getWeightTest(){
        assertEquals(23.1, basket.getWeightAllBalls(), DELTA);

    }
}