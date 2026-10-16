class Rectangle {
    private int length, width;

    public Rectangle() {
        length = 5;
        width = 2;
    }

    public Rectangle(int l, int w) {
        length = l;
        width = w;
    }

    public void setLength(int l) // sets the value of length
    {
        length = l;
    }

    public void setWidth(int w) // sets the value of width
    {
        width = w;
    }

    public int getLength() // gets the value of length
    {
        return length;
    }

    public int getWidth() // gets the value of width
    {
        return width;
    }

    public int area() {
        return (length * width);
    }
}

public class Activity2 {
    public static void main() {
        Rectangle rect = new Rectangle();
        rect.setLength(5);
        rect.setWidth(10);
        System.out.println("Area of Rectangle is:" + rect.area());
        System.out.println("Width of Rectangle is: " + rect.getWidth());
    }
}