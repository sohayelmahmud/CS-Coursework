class Address {
    private String streetNo;
    private String houseNo;
    private String city;

    public Address() {
        this.streetNo = "12";
        this.houseNo = "612";
        this.city = "Islamabad";
    }

    public Address(String streetNo, String houseNo, String city) {
        this.streetNo = streetNo;
        this.houseNo = houseNo;
        this.city = city;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void displayAddress() {
        System.out.println("House #: " + houseNo + ", Street #: " + streetNo + ", City: " + city);
    }
}

class Person {
    private String name;
    private Address address;

    public Person() {
        this.name = "Jim";
        this.address = new Address();
    }

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.print("Address: ");
        address.displayAddress();

    }
}

class Book {
    private String bookName;
    private String publisher;
    private Person author;

    public Book() {
        this.bookName = "Untitled";
        this.publisher = "Unknown Publisher";
        this.author = new Person();
    }

    public Book(String bookName, String publisher, Person author) {
        this.bookName = bookName;
        this.publisher = publisher;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Person getAuthor() {
        return author;
    }

    public void setAuthor(Person author) {
        this.author = author;
    }

    public void displayBookDetails() {
        System.out.println("Book Name: " + bookName);
        System.out.println("Publisher: " + publisher);
        System.out.println("Author Name: " + author.getName());
        System.out.print("Author ");
        author.getAddress().displayAddress();
    }
}

public class LabTask2 {
    public static void main(String[] args) {
        Address initialAddress = new Address("10", "12-A", "New York");
        Person author = new Person("Y. Danial Liang", initialAddress);

        Book book = new Book("Java Programming", "Pearson", author);

        System.out.println("--- Book 1 Details ---");
        book.displayBookDetails();

        Book book2 = new Book();
        book2.setBookName("Harry Potter");
        book2.setPublisher("Wingurdium");
        book2.getAuthor().setName("JK Rowling");
        book2.getAuthor().getAddress().setHouseNo("77-C");
        book2.getAuthor().getAddress().setStreetNo("15");
        book2.getAuthor().getAddress().setCity("London");

        System.out.println("--- Book 2 Details ---");
        book2.displayBookDetails();
    }
}