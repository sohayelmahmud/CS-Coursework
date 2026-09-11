import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        int range, term1 = 0, term2 = 1, term;
        String fabSequence = Integer.toString(term1) + ", " + Integer.toString(term2);
        Scanner num = new Scanner(System.in);

        System.out.println("        --- Fabonacci Number ---");
        System.out.print("Enter the number (the index of Fabonacci Term): ");
        range = num.nextInt();
        num.close();

        for (int i = 3 ; i <= range ; i++) {
            term = term1 + term2;
            fabSequence += ", " + Integer.toString(term);
            term1 = term2;
            term2 = term;
        }
        System.out.printf("The Fabonacci Sequence till %dth index is: %s", range, fabSequence);
    }
}