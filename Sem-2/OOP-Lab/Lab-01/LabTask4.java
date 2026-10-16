import java.util.Scanner;

class Rectangle {
    private double length, width;

    public void setData(double l, double w) {
        length = l;
        width = w;
    }

    public double calculateArea() {
        return (length * width);
    }
}

public class LabTask4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Rectangle rect = new Rectangle();

        System.out.print("Enter length: ");
        double l = input.nextDouble();

        System.out.print("Enter model name: ");
        double w = input.nextDouble();

        rect.setData(l, w);

        System.out.printf("\nArea of the rectangle: %.2f\n", rect.calculateArea());

        input.close();
    }
}
