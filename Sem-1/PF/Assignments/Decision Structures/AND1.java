import java.util.Scanner;

public class AND1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter a boolean value for 'first' (true/false): ");
        boolean first = inp.nextBoolean();

        System.out.print("Enter a boolean value for 'second' (true/false): ");
        boolean second = inp.nextBoolean();
        inp.close();

        System.out.println("Result of first && second is: " + (first && second));
        
    }
}
