import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class LibraryManagementSystem {

    static String[] bookTitles   = new String[100];
    static String[] bookAuthors  = new String[100];
    static int[]    bookYears    = new int[100];
    static String[] bookStatus   = new String[100]; // "available" or "borrowed"
    static int bookCount = 0;

    static String[] userNames     = new String[50];
    static String[] userPasswords = new String[50];
    static String[] userRoles     = new String[50];
    static int userCount = 0;

    static String[] borrowUser  = new String[100];
    static String[] borrowTitle = new String[100];
    static int borrowCount = 0;

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        loadUsers();
        loadBooks();
        loadBorrows();

        if (userCount == 0) {
            userNames[0]     = "admin";
            userPasswords[0] = "admin123";
            userRoles[0]     = "admin";
            userCount++;
        }

        int choice = 0;
        do {
            System.out.println("\n============================");
            System.out.println(" Library Management System ");
            System.out.println("============================");
            System.out.println("1. Admin Login");
            System.out.println("2. Student Login");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Please enter a number.");
                continue;
            }
            if (choice == 1) {
                if (login("admin")) adminMenu();
            } else if (choice == 2) {
                if (login("student")) studentMenu();
            } else if (choice == 3) {
                System.out.println("Goodbye!");
            } else {
                System.out.println("Invalid choice.");
            }
        } while (choice != 3);
    }

    public static boolean login(String role) {
        System.out.print("Username: ");
        String uname = input.nextLine();
        System.out.print("Password: ");
        String pass = input.nextLine();
        for (int i = 0; i < userCount; i++) {
            if (userNames[i].equals(uname) && userPasswords[i].equals(pass) && userRoles[i].equals(role)) {
                System.out.println("Welcome " + uname);
                return true;
            }
        }
        System.out.println("Wrong username or password.");
        return false;
    }

    public static void adminMenu() throws IOException {
        int choice = 0;
        do {
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Search Book");
            System.out.println("4. Update Book");
            System.out.println("5. View Borrow Records");
            System.out.println("6. Add Student");
            System.out.println("7. Logout");
            System.out.print("Enter choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Please enter a number.");
                continue;
            }
            if      (choice == 1) addBook();
            else if (choice == 2) viewBooks();
            else if (choice == 3) searchBook();
            else if (choice == 4) updateBook();
            else if (choice == 5) viewBorrows();
            else if (choice == 6) addStudent();
            else if (choice == 7) System.out.println("Logged out.");
            else                  System.out.println("Invalid choice.");
        } while (choice != 7);
    }

    public static void studentMenu() throws IOException {
        int choice = 0;
        do {
            System.out.println("\n--- Student Menu ---");
            System.out.println("1. View Books");
            System.out.println("2. Search Book");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Logout");
            System.out.print("Enter choice: ");
            try {
                choice = Integer.parseInt(input.nextLine());
            } catch (Exception e) {
                System.out.println("Please enter a number.");
                continue;
            }
            if      (choice == 1) viewBooks();
            else if (choice == 2) searchBook();
            else if (choice == 3) borrowBook();
            else if (choice == 4) returnBook();
            else if (choice == 5) System.out.println("Logged out.");
            else                  System.out.println("Invalid choice.");
        } while (choice != 5);
    }

    public static void addBook() throws IOException {
        if (bookCount >= 100) {
            System.out.println("Storage full.");
            return;
        }
        System.out.print("Title: ");
        String title = input.nextLine();
        if (title.equals("")) {
            System.out.println("Title cannot be empty.");
            return;
        }
        System.out.print("Author: ");
        String author = input.nextLine();
        if (author.equals("")) {
            System.out.println("Author cannot be empty.");
            return;
        }
        int year = 0;
        while (true) {
            System.out.print("Year (1000-2026): ");
            try {
                year = Integer.parseInt(input.nextLine());
                if (year < 1000 || year > 2026) {
                    System.out.println("Year must be between 1000 and 2026.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Year must be a number.");
            }
        }
        bookTitles[bookCount]  = title;
        bookAuthors[bookCount] = author;
        bookYears[bookCount]   = year;
        bookStatus[bookCount]  = "available";
        bookCount++;
        saveBooks();
        System.out.println("Book added.");
    }

    public static void viewBooks() {
        if (bookCount == 0) {
            System.out.println("No books found.");
            return;
        }
        System.out.println("\n--- Books ---");
        for (int i = 0; i < bookCount; i++) {
            System.out.println((i + 1) + ". " + bookTitles[i]
                + " | " + bookAuthors[i]
                + " | " + bookYears[i]
                + " | " + bookStatus[i]);
        }
    }

    public static void searchBook() {
        System.out.print("Enter title to search: ");
        String title = input.nextLine();
        boolean found = false;
        for (int i = 0; i < bookCount; i++) {
            if (bookTitles[i].equals(title)) {
                System.out.println("Found: " + bookTitles[i]
                    + " | " + bookAuthors[i]
                    + " | " + bookYears[i]
                    + " | " + bookStatus[i]);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Book not found.");
        }
    }

    public static void updateBook() throws IOException {
        viewBooks();
        if (bookCount == 0) return;
        int index = 0;
        while (true) {
            System.out.print("Enter book number to update: ");
            try {
                index = Integer.parseInt(input.nextLine()) - 1;
                if (index < 0 || index >= bookCount) {
                    System.out.println("Invalid number.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Enter a valid number.");
            }
        }
        System.out.print("New title (press Enter to keep): ");
        String t = input.nextLine();
        if (!t.equals("")) bookTitles[index] = t;

        System.out.print("New author (press Enter to keep): ");
        String a = input.nextLine();
        if (!a.equals("")) bookAuthors[index] = a;

        System.out.print("New year (press Enter to keep): ");
        String y = input.nextLine();
        if (!y.equals("")) {
            try {
                int newYear = Integer.parseInt(y);
                if (newYear >= 1000 && newYear <= 2026) {
                    bookYears[index] = newYear;
                } else {
                    System.out.println("Invalid year. Not updated.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Year not updated.");
            }
        }
        saveBooks();
        System.out.println("Book updated.");
    }

    public static void borrowBook() throws IOException {
        System.out.print("Your username: ");
        String uname = input.nextLine();
        System.out.print("Title to borrow: ");
        String title = input.nextLine();
        for (int i = 0; i < bookCount; i++) {
            if (bookTitles[i].equals(title)) {
                if (bookStatus[i].equals("available")) {
                    bookStatus[i] = "borrowed";
                    borrowUser[borrowCount]  = uname;
                    borrowTitle[borrowCount] = title;
                    borrowCount++;
                    saveBooks();
                    saveBorrows();
                    System.out.println("Book borrowed.");
                } else {
                    System.out.println("Book already borrowed.");
                }
                return;
            }
        }
        System.out.println("Book not found.");
    }

    public static void returnBook() throws IOException {
        System.out.print("Your username: ");
        String uname = input.nextLine();
        System.out.print("Title to return: ");
        String title = input.nextLine();
        boolean found = false;
        for (int i = 0; i < borrowCount; i++) {
            if (borrowUser[i].equals(uname) && borrowTitle[i].equals(title)) {
                for (int j = 0; j < bookCount; j++) {
                    if (bookTitles[j].equals(title)) {
                        bookStatus[j] = "available";
                        break;
                    }
                }
                for (int k = i; k < borrowCount - 1; k++) {
                    borrowUser[k]  = borrowUser[k + 1];
                    borrowTitle[k] = borrowTitle[k + 1];
                }
                borrowCount--;
                saveBooks();
                saveBorrows();
                System.out.println("Book returned.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("No borrow record found.");
        }
    }

    public static void viewBorrows() {
        if (borrowCount == 0) {
            System.out.println("No borrow records.");
            return;
        }
        System.out.println("\n--- Borrow Records ---");
        for (int i = 0; i < borrowCount; i++) {
            System.out.println((i + 1) + ". " + borrowUser[i] + " -> " + borrowTitle[i]);
        }
    }

    public static void addStudent() throws IOException {
        if (userCount >= 50) {
            System.out.println("Storage full.");
            return;
        }
        System.out.print("New username: ");
        String uname = input.nextLine();
        if (uname.equals("")) {
            System.out.println("Username cannot be empty.");
            return;
        }
        System.out.print("Password: ");
        String pass = input.nextLine();
        if (pass.equals("")) {
            System.out.println("Password cannot be empty.");
            return;
        }
        userNames[userCount]     = uname;
        userPasswords[userCount] = pass;
        userRoles[userCount]     = "student";
        userCount++;
        saveUsers();
        System.out.println("Student added.");
    }

    // FILE I/O - from lecture slides (PrintWriter + Scanner)

    public static void saveBooks() throws IOException {
        PrintWriter output = new PrintWriter(new File("books.txt"));
        for (int i = 0; i < bookCount; i++) {
            output.println(bookTitles[i]);
            output.println(bookAuthors[i]);
            output.println(bookYears[i]);
            output.println(bookStatus[i]);
        }
        output.close();
    }

    public static void loadBooks() throws IOException {
        java.io.File file = new java.io.File("books.txt");
        if (!file.exists()) return;
        Scanner fileIn = new Scanner(file);
        while (fileIn.hasNextLine() && bookCount < 100) {
            bookTitles[bookCount]  = fileIn.nextLine();
            bookAuthors[bookCount] = fileIn.nextLine();
            bookYears[bookCount]   = Integer.parseInt(fileIn.nextLine());
            bookStatus[bookCount]  = fileIn.nextLine();
            bookCount++;
        }
        fileIn.close();
    }

    public static void saveUsers() throws IOException {
        PrintWriter output = new PrintWriter(new File("users.txt"));
        for (int i = 0; i < userCount; i++) {
            output.println(userNames[i]);
            output.println(userPasswords[i]);
            output.println(userRoles[i]);
        }
        output.close();
    }

    public static void loadUsers() throws IOException {
        java.io.File file = new java.io.File("users.txt");
        if (!file.exists()) return;
        Scanner fileIn = new Scanner(file);
        while (fileIn.hasNextLine() && userCount < 50) {
            userNames[userCount]     = fileIn.nextLine();
            userPasswords[userCount] = fileIn.nextLine();
            userRoles[userCount]     = fileIn.nextLine();
            userCount++;
        }
        fileIn.close();
    }

    public static void saveBorrows() throws IOException {
        PrintWriter output = new PrintWriter(new File("borrows.txt"));
        for (int i = 0; i < borrowCount; i++) {
            output.println(borrowUser[i]);
            output.println(borrowTitle[i]);
        }
        output.close();
    }

    public static void loadBorrows() throws IOException {
        java.io.File file = new java.io.File("borrows.txt");
        if (!file.exists()) return;
        Scanner fileIn = new Scanner(file);
        while (fileIn.hasNextLine() && borrowCount < 100) {
            borrowUser[borrowCount]  = fileIn.nextLine();
            borrowTitle[borrowCount] = fileIn.nextLine();
            borrowCount++;
        }
        fileIn.close();
    }
}
