class Marks {
    public int mark1, mark2, mark3;

    public Marks() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    public Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    public int calculateSum() {
        return mark1 + mark2 + mark3;
    }
}

public class LabTask4 {
    public static void main(String[] args) {
        Marks ma1 = new Marks();
        System.out.println("Object 1 Total Marks: " + ma1.calculateSum());

        Marks ma2 = new Marks(85, 90, 78);
        System.out.println("Object 2 Total Marks: " + ma2.calculateSum());
    }
}