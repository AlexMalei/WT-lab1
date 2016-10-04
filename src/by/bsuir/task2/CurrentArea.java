package by.bsuir.task2;

public class CurrentArea {
    private Area[] areas = {new Area(new Point(-4, 5), 8, 5), new Area(new Point(-6, 0), 12, 3)};

    public boolean containsPoint(Point point){
        return areas[0].containPoint(point) || areas[1].containPoint(point);
    }

    public static void main(String[] args) {
        CurrentArea currentArea = new CurrentArea();
        System.out.println(currentArea.containsPoint(new Point(0, 2)));
    }

}
