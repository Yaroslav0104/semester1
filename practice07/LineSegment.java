package semester1.practice07;

public class LineSegment {
    private Point start;
    private Point end;

    public LineSegment(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public LineSegment(double x1, double y1, double x2, double y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public double getLength() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point getMidPoint() {
        double midX = (start.getX() + end.getX()) / 2.0;
        double midY = (start.getY() + end.getY()) / 2.0;
        return new Point(midX, midY);
    }

    public void printSegment() {
        System.out.println("Відрізок від початку (" + start.getX() + "; " + start.getY() +
                ") до кінця (" + end.getX() + "; " + end.getY() + ")");
    }
}
