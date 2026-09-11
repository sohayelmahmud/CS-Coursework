import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int num,sum=0;
        do
        {
            System.out.print("Enter any number (0 - 100): ");
            num = inp.nextInt();

            if (num <= 0 || num >= 100) {
                break;
            }
            sum += num;
        }
        while(true);
        System.out.printf("Sum of all entered numbers is: %d",sum);
    }
}
