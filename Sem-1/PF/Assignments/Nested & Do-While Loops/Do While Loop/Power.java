import java.util.Scanner;

public class Power {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);

            System.out.print("\t --- Power of Number ---");
            System.out.print("Enter an integer: ");
            int num = inp.nextInt();

            System.out.print("Enter power: ");
            short power = inp.nextShort();

            long result = 1L;
            int count = 1;
            do {
                result *= num;
                count++;
            } while (count <= power);
    
            System.out.println(num + "^" + power + " is: " + result);
        }
    }