import java.util.Scanner;

public class AND5 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter any integer: ");
        int num = inp.nextInt();
        
        // check if number is greater than 0, less than 10 and even
        boolean result = (num > 0) && (num < 10) && (num % 2 == 0);
        System.out.println("The number is: "+ num +
                         "(num > 0) && (num < 10) && (num % 2 == 0) = " + result);
    }
}
