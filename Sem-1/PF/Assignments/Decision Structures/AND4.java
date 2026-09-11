import java.util.Scanner;

public class AND4 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = inp.nextInt();
        
        System.out.print("Are you an undergraduate? (true/false): ");
        boolean underGrad = inp.nextBoolean();
        

        System.out.println("Can vote: " + ((age >= 18) && underGrad));
        
    }
}
