class Book {
    private String author;
    private String[] chapterNames;

    public Book() {
        this.author = "Unknown";
        this.chapterNames = new String[0];
    }

    public Book(String author, String[] chapterNames) {
        this.author = author;
        this.chapterNames = chapterNames;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setChapterNames(String[] chapterNames) {
        this.chapterNames = chapterNames;
    }

    public String getAuthor() {
        return author;
    }

    public String[] getChapterNames() {
        return chapterNames;
    }

    public boolean compareBooks(Book b2) {
        return this.author.equalsIgnoreCase(b2.getAuthor());
    }

    public Book compareChapterNames(Book b2) {
        if (this.chapterNames.length >= b2.chapterNames.length) {
            return this;
        } else {
            return b2;
        }
    }
}

public class LabTask2 {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("Robert Lafore");
        String[] b1Chapters = { "Introduction", "OOP", "Arrays", "Conditions" };
        book1.setChapterNames(b1Chapters);

        String[] b2Chapters = { "Loops", "String", "Methods" };
        Book book2 = new Book("Daniel Liang", b2Chapters);

        String sameAuthor = (book1.compareBooks(book2)) ? "Yes" : "No";
        //
        // if (book1.compareBooks(book2)) {
        // sameAuthor = "Yes";
        // } else {
        // sameAuthor = "No";
        // }
        System.out.println("Both books have the same author? " + sameAuthor);

        Book largerBook = book1.compareChapterNames(book2);
        System.out.println("Author of the book with more chapters: " + largerBook.getAuthor());
    }
}