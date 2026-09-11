import java.util.Scanner;

public class While3 {
    public static void main(String[] args) {
        float sum = 0;
        int num;
        Scanner input = new Scanner(System.in);

        while (sum <= 100) {
            System.out.print("Enter any num: ");
            num = Integer.parseInt(input.nextLine());
            
            sum += num; 
        }
        System.out.print("Sum is: " + sum);
        input.close();
    }
}
