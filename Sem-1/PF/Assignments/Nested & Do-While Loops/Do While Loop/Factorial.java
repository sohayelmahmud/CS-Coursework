import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = inp.nextInt();

        long fact = 1L; 
        int i = 1;
        do {
            fact *= i;
            i++;
        } while (i <= num);
        System.out.println(num + " Factorial is: " + fact);
    }
}