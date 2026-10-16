class Point {
    private int x;
    private int y;

    public Point() {
        x = 0;

        y = 0;
    }

    public Point(int a, int b) {
        x = a;
        y = b;
    }

    public void setX(int a) {
        x = a;
    }

    public void setY(int b) {
        y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void display() {
        System.out.println("x coordinate = " + x + " y coordinate = " + y);
    }

    public void movePoint(int a, int b) {
        x = x + a;
        y = y + b;
    }
}

public class Activity3 {
    public static void main() {
        Point p1 = new Point();
        p1.setX(10);
        p1.setY(7);
        p1.display();
        Point p2 = new Point(10, 11);
        p2.movePoint(2, 3);
        p2.display();
    }
}