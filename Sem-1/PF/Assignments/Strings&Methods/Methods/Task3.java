import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("\t --- Sorted Numbers ---");
        System.out.print("Enter any three numbers: ");
        double num1 = inp.nextDouble();
        double num2 = inp.nextDouble();
        double num3 = inp.nextDouble();

        displaySortedNumbers(num1, num2, num3);
    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
	// using bubble sort algorithm
        double larger;

        if (num1 > num2) {
            larger = num1;
            num1 = num2;
            num2 = larger;
        }
        if (num2 > num3) {
            larger = num2;
            num2 = num3;
            num3 = larger;
        }
        if (num1 > num2) {
            larger = num1;
            num1 = num2;
            num2 = larger;
        }

        System.out.println("Numbers in Sorted Format: " + num1 + ", " + num2 + ", " + num3);
    }
}