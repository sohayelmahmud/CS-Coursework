
// Bookstore.java
import java.util.ArrayList;

abstract class Book {
    private String title;
    private String author;
    private double price;
    private String genre;

    Book(String title, String author, double price, String genre) {
        this.title = title;
        this.author = author;
        setPrice(price);
        this.genre = genre;
    }

    // customers view
    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    // authorized staff can modify
    protected void setTitle(String title) {
        this.title = title;
    }

    protected void setAuthor(String author) {
        this.author = author;
    }

    protected void setPrice(double price) {
        if (price > 0)
            this.price = price;
        else
            System.out.println("Invalid price! Must be greater than zero.");
    }

    protected void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public abstract void displayDetails();

    public boolean equals(Book other) {
        if (other == null)
            return false;
        return this.title.equals(other.title)
                && this.author.equals(other.author)
                && this.genre.equals(other.genre);
    }
}

class Textbook extends Book {
    private int editionNumber;

    Textbook(String title, String author, double price, String genre, int editionNumber) {
        super(title, author, price, genre);
        this.editionNumber = editionNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Textbook ---");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: Rs. " + getPrice());
        System.out.println("Genre: " + getGenre());
        System.out.println("Edition: " + editionNumber);
    }
}

class Novel extends Book {
    private String seriesName;

    Novel(String title, String author, double price, String genre, String seriesName) {
        super(title, author, price, genre);
        this.seriesName = seriesName;
    }

    @Override
    public void displayDetails() {
        System.out.println("--- Novel ---");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Price: Rs. " + getPrice());
        System.out.println("Genre: " + getGenre());
        System.out.println("Series: " + seriesName);
    }
}

// bundle order
class Order {
    private ArrayList<Book> books = new ArrayList<>();

    // single
    public void placeOrder(Book b) {
        if (b != null)
            books.add(b);
    }

    // bundle order -- multiple books
    public void placeOrder(Book[] items) {
        if (items != null) {
            for (Book b : items) {
                if (b != null)
                    books.add(b);
            }
        }
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public double calculateTotal() {
        double total = 0;
        for (Book b : books)
            total += b.getPrice();
        return total;
    }
}

class BillingSystem {
    public void processOrder(Order order) {
        System.out.println("\n======= RECEIPT =======");
        for (Book b : order.getBooks()) {
            System.out.println(b.getTitle() + " by " + b.getAuthor() + " - Rs. " + b.getPrice());
        }
        System.out.println("-----------------------");
        System.out.println("Total Bill: Rs. " + order.calculateTotal());
        System.out.println("=======================");
    }
}

public class BCS_SP26_2 {
    public static void main(String[] args) {
        Textbook tb1 = new Textbook("Java Programming", "John Doe", 1500, "Textbook", 3);
        Textbook tb2 = new Textbook("Java Programming", "John Doe", 1500, "Textbook", 3);
        Novel n1 = new Novel("Harry Potter", "J.K. Rowling", 2000, "Fantasy", "HP Series");
        Novel n2 = new Novel("The Hobbit", "J.R.R. Tolkien", 1800, "Fantasy", "Middle-earth");

        System.out.println("=== Book Details ===");
        tb1.displayDetails();
        n1.displayDetails();
        n2.displayDetails();

        System.out.println("\n=== Comparison ===");
        System.out.println("tb1 equals tb2? " + tb1.equals(tb2));
        System.out.println("n1 equals n2? " + n1.equals(n2));

        // invalid price attempt -- encapsulation
        System.out.println("\n=== Invalid Price Attempt ===");
        n1.setPrice(-100); // protected – accessible in same file, but validates

        BillingSystem billing = new BillingSystem();

        // Single book order
        Order order1 = new Order();
        order1.placeOrder(n1);
        billing.processOrder(order1);

        // exclusive study pack bundle -- textbook + notebook + bookmark (represented as
        // books here)
        Textbook notebook = new Textbook("Study Notebook", "Hamdan Store", 300, "Stationery", 1);
        Textbook bookmark = new Textbook("Bookmark", "Hamdan Store", 50, "Stationery", 1);

        Order order2 = new Order();
        order2.placeOrder(new Book[] { tb1, notebook, bookmark });
        billing.processOrder(order2);
    }
}