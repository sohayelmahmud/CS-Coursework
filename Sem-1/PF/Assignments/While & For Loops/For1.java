import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        int num = 0;
        boolean isPrime = true;
        Scanner input = new Scanner(System.in);

        System.out.println("      --- Prime Number Identifier ---");
        System.out.print("Enter any integer: ");
        num = input.nextInt();
        input.close();

        if (num < 2)
            isPrime = false;
            
        else {
            for (int div = 2; div <= num / 2 ; div++) {
                if (num % div == 0) {
                    isPrime = false;
                    break;
            }
        }
    }
        if (isPrime){
            System.out.printf("%d is Prime Number.", num);
        }
        else {
            System.out.printf("%d is Not Prime Number", num);
        }
    }
}

