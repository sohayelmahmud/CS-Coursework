class Marks {
    private int mark1, mark2, mark3;

    public Marks() {
        mark1 = 1;
        mark2 = 2;
        mark3 = 3;
    }

    public Marks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    public void setMarks(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    public void setMark1(int m1) {
        mark1 = m1;
    }

    public void setMark2(int m2) {
        mark2 = m2;
    }

    public void setMark3(int m3) {
        mark3 = m3;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public int calculateSum() {
        return mark1 + mark2 + mark3;
    }
}

public class LabTask1 {
    public static void main(String[] args) {
        // object 1
        Marks ma1 = new Marks();
        System.out.println("Object 1 Total Marks: " + ma1.calculateSum());
        System.out.println("Object 1 Marks: " + ma1.getMark1() + ", " + ma1.getMark2() + ", " + ma1.getMark3());

        // object 2
        Marks ma2 = new Marks(4, 5, 6);
        System.out.println("Object 2 Total Marks: " + ma2.calculateSum());
        System.out.println("Object 2 Marks: " + ma2.getMark1() + ", " + ma2.getMark2() + ", " + ma2.getMark3());

        // object 3
        Marks ma3 = new Marks();
        ma3.setMarks(9, 8, 7);
        System.out.println("Object 3 Total Marks: " + ma3.calculateSum());
        System.out.println("Object 3 Marks: " + ma3.getMark1() + ", " + ma3.getMark2() + ", " + ma3.getMark3());

        // object 4
        Marks ma4 = new Marks(85, 90, 78);
        ma4.setMark1(6);
        ma4.setMark2(7);
        ma4.setMark3(8);
        System.out.println("Object 4 Total Marks: " + ma4.calculateSum());
        System.out.println("Object 4 Marks: " + ma4.getMark1() + ", " + ma4.getMark2() + ", " + ma4.getMark3());
    }
}