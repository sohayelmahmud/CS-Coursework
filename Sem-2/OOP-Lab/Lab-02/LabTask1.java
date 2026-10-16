class Circle {
    public int radius;
    public double pi;

    public Circle() {
        radius = 5;
        pi = 3.14;
    }

    public Circle(int r, double p) {
        radius = r;
        pi = p;
    }

    public double calculateCircumference() {
        return 2 * pi * radius;
    }
}

public class LabTask1 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println("c1 Circumference: " + c1.calculateCircumference());

        Circle c2 = new Circle(5, 3.14159);
        System.out.println("c2 Circumference: " + c2.calculateCircumference());
    }
}
