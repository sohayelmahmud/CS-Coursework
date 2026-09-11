import java.util.Scanner;

public class NaturalNumSum {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int num = inp.nextInt();

        int sum = 0, count = 1;
        do {
            sum += count;
            count++;
        } while (count <= num);

        System.out.print("Sum of numbers from 1 to " + num + " is: " + sum);
    }
}

