class Point {
    private double xCord;
    private double yCord;

    public Point(double xCord, double yCord) {
        this.xCord = xCord;
        this.yCord = yCord;
    }

    public double getXCord() {
        return xCord;
    }

    public void setXCord(double xCord) {
        this.xCord = xCord;
    }

    public double getYCord() {
        return yCord;
    }

    public void setYCord(double yCord) {
        this.yCord = yCord;
    }

    public void display() {
        System.out.println("(" + xCord + ", " + yCord + ")");
    }
}

class Line {
    private Point startPoint;
    private Point endPoint;

    public Line(Point startPoint, Point endPoint) {
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double findLength() {
        double x1 = startPoint.getXCord();
        double y1 = startPoint.getYCord();
        double x2 = endPoint.getXCord();
        double y2 = endPoint.getYCord();

        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }
}

public class LabTask3 {
    public static void main(String[] args) {
        Line line1 = new Line(new Point(0, 0), new Point(3, 4));
        Line line2 = new Line(new Point(1, 2), new Point(7, 10));

        System.out.println("Length of Line 1: " + line1.findLength());
        System.out.println("Length of Line 2: " + line2.findLength());
    }
}