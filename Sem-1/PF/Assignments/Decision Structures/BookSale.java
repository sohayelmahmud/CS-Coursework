import java.util.Scanner;

public class BookSale {
    public static void main(String[] args) {
        int books;
        Scanner value = new Scanner(System.in);

        System.out.print("How many books you bought this month? ");
        books = value.nextInt();

        books = books > 4 ? 4 : books;

        switch (books) {
            case 0 -> System.out.println("You earned 0 points.");
            case 1 -> System.out.println("You earned 5 points.");
            case 2 -> System.out.println("You earned 15 points.");
            case 3 -> System.out.println("You earned 30 points.");
            case 4 -> System.out.println("You earned 60 points.");
            default -> System.out.println("Wrong Input!");
        }
    }
}
