import java.util.Scanner;

public class Question7 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\t --- Sorted Numbers ---");
        System.out.print("Enter any three numbers: ");
        double num1 = inp.nextDouble();
        double num2 = inp.nextDouble();
        double num3 = inp.nextDouble();

        sortedNumbers(num1, num2, num3);
    }

    private static void sortedNumbers(double num1, double num2, double num3) {
        // bubble sorting algorithm; 
        double larger = 0;
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
        System.out.printf("Numbers in Sorted Format are: %.2f, %.2f, %.2f", num1, num2, num3);
    }
}