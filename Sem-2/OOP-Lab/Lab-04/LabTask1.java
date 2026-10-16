class Distance {
    private int feet;
    private double inches;

    public Distance() {
        feet = 0;
        inches = 0.0;
    }

    public Distance(int feet, double inches) {
        this.feet = feet;
        this.inches = inches;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }

    public void setInches(double inches) {
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public double getInches() {
        return inches;
    }

    public Distance addDistance(Distance d2) {
        Distance sum = new Distance();
        sum.feet = this.feet + d2.feet;
        sum.inches = this.inches + d2.inches;

        if (sum.inches >= 12.0) {
            sum.feet += (int) (sum.inches / 12);
            sum.inches = sum.inches % 12;
        }

        return sum;
    }

    public void display() {
        System.out.println("Distance: " + feet + " feet " + inches + " inches");
    }
}

public class LabTask1 {
    public static void main(String[] args) {
        Distance d1 = new Distance(5, 8.5);
        Distance d2 = new Distance(3, 6.0);

        System.out.print("Distance 1: ");
        d1.display();

        System.out.print("Distance 2: ");
        d2.display();

        Distance d3 = d1.addDistance(d2);

        System.out.print("Sum of Distances: ");
        d3.display();
    }
}