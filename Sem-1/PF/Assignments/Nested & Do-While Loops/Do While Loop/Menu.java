import java.util.Scanner;
public class Menu {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\t -- Menu --");
            System.out.println("1. Print Hello");
            System.out.println("2. Print Goodbye");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = inp.nextInt();
            
            switch (choice) {
                case 1 -> System.out.println("Hello!");
                case 2 -> System.out.println("Goodbye!");
                case 3 -> System.out.println("Exiting the program.");
                default -> System.out.println("Invalid choice. Try again.");
            }
        } while (choice != 3);
    }
}
