class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Denominator cannot be zero. Setting default to 1.");
            this.denominator = 1;
        }
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        } else {
            System.out.println("Denominator cannot be zero.");
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public boolean equals(Fraction f2) {
        return (this.numerator * f2.denominator == this.denominator * f2.numerator);
    }

    public void display() {
        System.out.println(numerator + "/" + denominator);
    }
}

public class LabTask3 {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(2, 4);
        Fraction f2 = new Fraction(1, 2);
        Fraction f3 = new Fraction(3, 5);

        System.out.print("Fraction 1: ");
        f1.display();

        System.out.print("Fraction 2: ");
        f2.display();

        System.out.print("Fraction 3: ");
        f3.display();

        String compare1 = (f1.equals(f2)) ? "Yes" : "No";
        String compare2 = (f1.equals(f3)) ? "Yes" : "No";
        System.out.println("Is Fraction 1 equal to Fraction 2? " + compare1);
        System.out.println("Is Fraction 1 equal to Fraction 3? " + compare2);
    }
}