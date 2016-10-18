package by.bsuir.task9;

import java.util.ArrayList;

public class Basket {
    ArrayList<Ball> balls;

    public Basket(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public void addBall(Ball ball){
        balls.add(ball);
    }

    public void addBallToPosition(int index ,Ball ball){
        balls.add(index, ball);
    }

    public void removeAllBalls(){
        balls.removeAll(balls);
    }

    public void removeBallToIndex(int index ){
        balls.remove(index);
    }

    public int getCountBalls(){
        return balls.size();
    }

    public int getCountBlueBalls(){
        int count = 0;
        for (Ball ball : balls){
            if (ball.getColor() == Color.BLUE){
                count++;
            }
        }
        return count;
    }

    public double getWeightAllBalls(){
        double weight = 0.0;
        for (Ball ball : balls){
            weight += ball.getWeigth();
        }
        return weight;
    }

    public static void main(String[] args) {
        Basket basket = new Basket(new ArrayList<>(5));
        basket.addBall(new Ball(Color.GREEN, 4.5));
        System.out.println(basket.getCountBlueBalls());
        System.out.println(basket.getWeightAllBalls());
    }
}
