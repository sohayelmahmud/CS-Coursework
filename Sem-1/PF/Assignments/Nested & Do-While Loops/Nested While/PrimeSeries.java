import java.util.Scanner;

public class PrimeSeries {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\t --- Prime Number Series ---");
        System.out.print("Enter lower limit: ");
        int low = inp.nextInt();

        System.out.print("Enter upper limit: ");
        int up = inp.nextInt();
        
        System.out.printf("\nPrime Numbers from %d to %d are: \n", low, up);
        int num = low;
        while (num <= up) {
            boolean isPrime = true;
            int div = 2;

            while (div < (int) Math.sqrt(num)) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
                }
                div++;
            }

            if (isPrime) {
                System.out.print(num + "\t ");
            }
            num++;
        }
    }
}
