package by.bsuir.task9;

public class Ball {
    private Color color;
    private double weigth;

    public Ball(Color color, double weigth) {
        this.color = color;
        this.weigth = weigth;
    }

    public Color getColor() {

        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getWeigth() {
        return weigth;
    }

    public void setWeigth(double weigth) {
        this.weigth = weigth;
    }
}
