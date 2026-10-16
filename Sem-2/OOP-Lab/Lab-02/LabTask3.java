class Distance {
    public int feet, inches;

    public Distance() {
        feet = 0;
        inches = 0;
    }

    public Distance(int f, int in) {
        feet = f;
        inches = in;
    }

    public void display() {
        System.out.println("Distance: " + feet + " feet, " + inches + " inches");
    }
}

public class LabTask3 {
    public static void main(String[] args) {
        Distance d1 = new Distance();
        d1.display();

        Distance d2 = new Distance(5, 8);
        d2.display();
    }
}