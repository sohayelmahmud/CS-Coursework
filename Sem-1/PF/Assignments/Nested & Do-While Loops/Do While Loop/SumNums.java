import java.util.Scanner;

public class SumNums {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("\t --- Average ---\n");
        System.out.println("Note: Enter 0 to exit");
        System.out.println("Enter a series of numbers: ");
        
        int sum = 0, num = 0;
        short count = 0;
        
        do {
            num = inp.nextInt();
            sum += num;
            count++;
        } while (num != 0);
        
        if (count > 1) {
            float avg = (float) sum / (count - 1);
            System.out.printf("Average of %d numbers is: %d", count-1, avg);
        } else {
            System.out.println("No numbers entered to calculate the average.");
        }
    }
}
