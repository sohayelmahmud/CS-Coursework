import java.util.Scanner;

class Publication {
    private String title;
    private double price;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void display() {
        System.out.println("Title: " + title + ", Price: $" + price);
    }
}

class Book extends Publication {
    private int pageCount;

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void display() {
        super.display();
        System.out.println("Page Count: " + pageCount);
    }
}

class Tape extends Publication {
    private double playingTime;

    public double getPlayingTime() {
        return playingTime;
    }

    public void setPlayingTime(double playingTime) {
        this.playingTime = playingTime;
    }

    public void display() {
        super.display();
        System.out.println("Playing Time: " + playingTime + " mins");
    }
}

public class LabTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book book = new Book();
        System.out.print("Enter book title: ");
        book.setTitle(scanner.nextLine());
        System.out.print("Enter book price: ");
        book.setPrice(scanner.nextDouble());
        System.out.print("Enter page count: ");
        book.setPageCount(scanner.nextInt());
        scanner.nextLine();

        Tape tape = new Tape();
        System.out.print("Enter tape title: ");
        tape.setTitle(scanner.nextLine());
        System.out.print("Enter tape price: ");
        tape.setPrice(scanner.nextDouble());
        System.out.print("Enter playing time in minutes: ");
        tape.setPlayingTime(scanner.nextDouble());

        book.display();
        tape.display();

        scanner.close();
    }
}