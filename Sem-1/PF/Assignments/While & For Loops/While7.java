import java.util.Scanner;

public class While7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);

        System.out.println("     *** Reverse 4-digit Number ***");
        String num;

        while (true) {
            
            System.out.print("Enter a 4-digit integer: ");
            num = number.nextLine();

            if ((num.length() == 4 && num.matches("\\d+"))) {
                break;
            }
            else {
                System.out.println("Wrong input!");
            }
        }

        String reversed = new StringBuilder(num).reverse().toString();
        System.out.println("Reversed Digit is: " + reversed);
    }
}
