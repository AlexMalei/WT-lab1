package by.bsuir.task2;

public class Area {
    private Point basePoint;
    private double width;
    private double height;

    public Area(Point leftTopPoint, double width, double height) {
        this.basePoint = leftTopPoint;
        this.width = width;
        this.height = height;
    }

    boolean containPoint(Point point ){
        if ((point.X >= basePoint.X ) && (point.X <= basePoint.X + width)
                && (point.Y <= basePoint.Y) && (point.Y >= basePoint.Y - height))
            return true;
        else
            return false;
    }
}
