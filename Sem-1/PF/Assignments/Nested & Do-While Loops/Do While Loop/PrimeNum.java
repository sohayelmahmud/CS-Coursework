import java.util.Scanner;

public class PrimeNum {
        public static void main(String[] args) {
            Scanner inp = new Scanner(System.in);

            System.out.print("\t --- Prime Number --- \n");
            System.out.print("Enter a positive integer: ");
            long num = inp.nextInt();
            int div = 2;
            boolean isPrime = true;
    
            if (num <= 1) {
                isPrime = false;
            }
            else if (num == 2) {
                isPrime = true;
            }
            else {
                do {
                    if (num % div == 0) {
                        isPrime = false;
                        break;
                    }
                    div++;
                } while (div <= (int) Math.sqrt(num));
            }
            
            if (isPrime) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        }
    }