import java.util.*;
import java.io.*;

public class SP26_BCS_114 {
    public static Scanner input = new Scanner(System.in);

    // prompt for continue or stop executed question
    public static boolean askAgain() {
        System.out.println("\n\nDo you want to Execute this question again then press ( y )");
        System.out.print("Otherwise Press ( 0 ) to go to the main menu: ");
        char choice = input.next().toLowerCase().charAt(0);
        return choice == 'y';
    }

    // question 1
    public static void question1() throws IOException {
        System.out.println("\n===============================================================");
        System.out.println("             --->Executing Question - 1<-------             ");
        File file = new File("Text_IO.txt");
        if (file.exists()) {
            System.out.println("file already exists. appending new data...");
        } else {
            System.out.println("file does not exist. creating a new file...");
        }

        FileWriter filewriter = new FileWriter(file, true);
        PrintWriter output = new PrintWriter(filewriter);

        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * 100);
            output.print(num + " ");
        }

        output.println();

        output.close();
        filewriter.close();
    }

    // question 2
    public static void question2(String[] args) throws IOException {
        System.out.println("\n===============================================================");
        System.out.println("             --->Executing Question - 2<-------             ");
        if (args.length == 0) {
            System.out.println("please provide a file name as a command line argument.");
            return;
        }

        String fileName = args[0];
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("file does not exist....");
            return;
        }
        Scanner inputFile = new Scanner(file);

        int wordCount = 0, charCount = 0, lineCount = 0;
        while (inputFile.hasNext()) {
            String word = inputFile.next();
            wordCount++;
            charCount += word.length();
        }
        inputFile.close();

        Scanner lineInput = new Scanner(file);
        while (lineInput.hasNextLine()) {
            lineInput.nextLine();
            lineCount++;
        }
        lineInput.close();

        System.out.println("This txt file has " + charCount + " characters");
        System.out.println("This txt file has " + wordCount + " words.");
        System.out.println("This txt file has " + lineCount + " lines.");
    }

    // helper function to find ranking for question 3
    public static int findRanking(File file, String gender, String name) throws IOException {
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            int rank = inputFile.nextInt();
            String boyName = inputFile.next();
            String girlName = inputFile.next();

            if (gender.equalsIgnoreCase("M")) {
                if (boyName.equalsIgnoreCase(name)) {
                    inputFile.close();
                    return rank;
                }
            } else {
                if (girlName.equalsIgnoreCase(name)) {
                    inputFile.close();
                    return rank;
                }
            }
        }
        inputFile.close();
        return -1;
    }

    // question 3
    public static void question3() throws IOException {
        System.out.println("\n===============================================================");
        System.out.println("             --->Executing Question - 3<-------             ");
        System.out.print("Enter the year: ");
        int year = input.nextInt();

        String fileName = "babynameranking" + year + ".txt";
        File file = new File(fileName);
        if (!file.exists()) {
            System.out.println("Year does not match the criteria.");
            return;
        }
        input.nextLine();

        System.out.print("Enter the gender: ");
        String gender = input.next();
        if (!(gender.equalsIgnoreCase("M") || gender.equalsIgnoreCase("F"))) {
            System.out.println("Gender doesn't match the criteria.");
            return;
        }

        System.out.print("Enter the Name: ");
        String name = input.next();

        int rank = findRanking(file, gender, name);

        if (rank != -1) {
            System.out.println(name + " is ranked #" + rank + " in year " + year);
        } else {
            System.out.println("The name " + name + " is not ranked in year " + year);
        }

    }

    public static void main(String[] args) throws IOException {
        int option;

        do {
            System.out.println("\n===============================================================");
            System.out.println("             --->Main Menu (Assignment-4)<-------              ");
            System.out.println("1. Question-1");
            System.out.println("2. Question-2");
            System.out.println("3. Question-3");
            System.out.println("Press option (1-3) to execute the program and Press 0 to Exit");
            System.out.print("Enter your option: ");

            if (input.hasNextInt()) {
                option = input.nextInt();

                switch (option) {
                    case 1:
                        do {
                            question1();
                        } while (askAgain());
                        break;
                    case 2:
                        do {
                            question2(args);
                        } while (askAgain());
                        break;
                    case 3:
                        do {
                            question3();
                        } while (askAgain());
                        break;
                    case 0:
                        System.out.println("Exiting... Good Bye!");
                        break;
                    default:
                        System.out.println("Invalid option! Try again.");
                }
                input.nextLine();
            } else {
                System.out.println("Invalid input! Please enter a number (0-3).");
                input.next();
                option = -1;
            }

        } while (option != 0);

        input.close();
    }
}
