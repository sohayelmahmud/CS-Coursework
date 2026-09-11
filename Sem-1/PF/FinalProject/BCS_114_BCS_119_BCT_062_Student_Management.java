import java.util.*;
import java.io.*;

public class BCS_114_BCS_119_BCT_062_Student_Management {
    public static Scanner input = new Scanner(System.in);

    public static final String FILE_NAME = "students.txt";
    public static final int MAX = 100;

    // data arrays
    public static int[] studentIDs = new int[MAX];
    public static String[] studentNames = new String[MAX];
    public static int[] studentAges = new int[MAX];
    public static double[] studentMarks = new double[MAX];
    public static int[] studentAttendance = new int[MAX];
    public static int currentCount = 0;

    // teacher login id & pass
    public static final String CRED_FILE = "credentials.txt";
    public static String teacherID = "admin";
    public static String teacherPassword = "123";

    // teacher login validation
    public static boolean teacherLogin() {
        System.out.println("\n--- Teacher Login ---");
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter teacher id: ");
            String idInput = input.nextLine();
            System.out.print("Enter password: ");
            String passInput = input.nextLine();

            // validate credentials
            if (idInput.equals(teacherID) && passInput.equals(teacherPassword)) {
                System.out.println("Login successful!");
                return true;
            } else {
                attempts--;
                System.out.println("Invalid ID or Password! Attempts remaining: " + attempts);
            }
        }
        System.out.println("Login failed! Returning to main menu.");
        return false;
    }

    // teacher login
    public static void teacherMenu() {
        int op = -1;
        do {
            System.out.println("\n====================================");
            System.out.println("--- Welcome to Teacher Dashboard ---");
            System.out.println("====================================");
            System.out.println("1. Add Student Record");
            System.out.println("2. View All Records");
            System.out.println("3. Update Student Record");
            System.out.println("4. Search Student Record");
            System.out.println("5. Remove Student Record");
            System.out.println("0. Log Out");
            System.out.print("Select operation: ");

            try {
                op = Integer.parseInt(input.nextLine());
                switch (op) {
                    case 1:
                        addRecord();
                        break;
                    case 2:
                        viewRecords();
                        break;
                    case 3:
                        updateRecord();
                        break;
                    case 4:
                        searchRecord();
                        break;
                    case 5:
                        removeStudent();
                        break;
                    case 0:
                        System.out.println("Exiting Teacher Dashboard...");
                        break;
                    default:
                        System.out.println("Invalid operation! Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                op = -1; // reset to keep loop running
            }
        } while (op != 0);
    }

    // valid input
    public static int getValidInt(String prompt, int min, int max) {
        while (true) {
            try {
                System.out.print(prompt);
                int val = Integer.parseInt(input.nextLine());
                if (val < min || val > max) {
                    System.out.println("Invalid range! Must be between " + min + " and " + max + ".");
                    continue;
                }
                return val;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
        }
    }

    public static double getValidDouble(String prompt, double min, double max) {
        while (true) {
            try {
                System.out.print(prompt);
                double val = Double.parseDouble(input.nextLine());
                if (val < min || val > max) {
                    System.out.println("Invalid range! Must be between " + min + " and " + max + ".");
                    continue;
                }
                return val;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid decimal number.");
            }
        }
    }

    // add record
    public static void addRecord() {
        System.out.println("\n--- Add New Student Record ---");
        if (currentCount >= MAX) {
            System.out.println("Database is full! Cannot add more students.");
            return;
        }

        // ID input & validation
        int id = 0;
        while (true) {
            try {
                System.out.print("Enter Student ID: ");
                id = Integer.parseInt(input.nextLine());

                // duplicate ID check
                boolean exists = false;
                for (int i = 0; i < currentCount; i++) {
                    if (studentIDs[i] == id) {
                        exists = true;
                        break;
                    }
                }
                if (exists) {
                    System.out.println("This ID already exists! Try a unique ID.");
                    continue;
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid ID! Please enter an integer number.");
            }
        }

        // name input
        System.out.print("Enter Student Name: ");
        String name = input.nextLine().replace(",", " ");

        // age input & validation
        int age = getValidInt("Enter Age (18-30): ", 18, 30);
        int attendance = getValidInt("Enter Attendance Percentage (0-100): ", 0, 100);
        double marks = getValidDouble("Enter Marks (0-100): ", 0, 100);

        // save data
        studentIDs[currentCount] = id;
        studentNames[currentCount] = name;
        studentAges[currentCount] = age;
        studentMarks[currentCount] = marks;
        studentAttendance[currentCount] = attendance;

        currentCount++;

        // save immediately to file
        saveDataToFile();
        System.out.println("Student record added successfully and saved to file!");
    }

    // view record
    public static void viewRecords() {
        System.out.println(
                "\n============================= ALL STUDENT RECORDS =============================");
        if (currentCount == 0) {
            System.out.println("No records found! Add some students first.");
            return;
        }

        // table top border
        System.out.println("+------------+----------------------+------------+------------+---------------+");
        System.out.printf("| %-10s | %-20s | %-10s | %-10s | %-13s |\n", "ID", "Name", "Age", "Marks", "Attendance");
        // header separator
        System.out.println("+------------+----------------------+------------+------------+---------------+");

        // table data
        for (int i = 0; i < currentCount; i++) {
            System.out.printf("| %-10d | %-20s | %-10d | %-10.2f | %-13s |\n", studentIDs[i], studentNames[i],
                    studentAges[i], studentMarks[i], studentAttendance[i] + "%");
        }

        // table bottom border
        System.out.println("+------------+----------------------+------------+------------+---------------+");
    }

    // search student by id
    public static void searchRecord() {
        System.out.println("\n--- Search Student Record ---");
        if (currentCount == 0) {
            System.out.println("No records found! Database is empty.");
            return;
        }

        int searchid = 0;
        try {
            System.out.print("Enter student ID to search: ");
            searchid = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID! ID must be an integer.");
            return;
        }

        int foundindex = -1;
        for (int i = 0; i < currentCount; i++) {
            if (studentIDs[i] == searchid) {
                foundindex = i;
                break;
            }
        }

        if (foundindex != -1) {
            System.out.println("\nRecord found:");
            System.out.println("ID: " + studentIDs[foundindex]);
            System.out.println("Name: " + studentNames[foundindex]);
            System.out.println("Age: " + studentAges[foundindex]);
            System.out.println("Marks: " + studentMarks[foundindex]);
            System.out.println("Attendance: " + studentAttendance[foundindex] + "%");
        } else {
            System.out.println("Student with ID " + searchid + " not found.");
        }
    }

    // update marks and attendance
    // update marks and attendance
    public static void updateRecord() {
        System.out.println("\n--- Update Student Record ---");
        if (currentCount == 0) {
            System.out.println("No records found! database is empty.");
            return;
        }

        int searchid = 0;
        try {
            System.out.print("Enter student id to update: ");
            searchid = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID! ID must be an integer.");
            return;
        }

        int foundindex = -1;
        for (int i = 0; i < currentCount; i++) {
            if (studentIDs[i] == searchid) {
                foundindex = i;
                break;
            }
        }

        if (foundindex == -1) {
            System.out.println("Student id not found.");
            return;
        }

        System.out.println("Updating record for: " + studentNames[foundindex]);

        // update data
        studentAttendance[foundindex] = getValidInt("Enter Attendance Percentage (0-100): ", 0, 100);
        studentMarks[foundindex] = getValidDouble("Enter Marks (0-100): ", 0, 100);

        // saave the file
        saveDataToFile();
        System.out.println("Record updated successfully and saved to file!");
    }

    // remove student record by id
    public static void removeStudent() {
        System.out.println("\n--- Remove Student Record ---");
        if (currentCount == 0) {
            System.out.println("No records found! Database is empty.");
            return;
        }

        int searchid = 0;
        try {
            System.out.print("Enter student ID to remove: ");
            searchid = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID! ID must be an integer.");
            return;
        }

        int foundindex = -1;
        for (int i = 0; i < currentCount; i++) {
            if (studentIDs[i] == searchid) {
                foundindex = i;
                break;
            }
        }

        if (foundindex == -1) {
            System.out.println("Student ID not found.");
            return;
        }

        System.out.println("Removing record for: " + studentNames[foundindex]);

        for (int i = foundindex; i < currentCount - 1; i++) {
            studentIDs[i] = studentIDs[i + 1];
            studentNames[i] = studentNames[i + 1];
            studentAges[i] = studentAges[i + 1];
            studentMarks[i] = studentMarks[i + 1];
            studentAttendance[i] = studentAttendance[i + 1];
        }

        currentCount--;
        saveDataToFile();
        System.out.println("Student record removed successfully and saved to file!");
    }

    // load data from txt file to arrays
    public static void loadDataFromFile() {
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            return; // no file found, starting fresh
        }

        try (Scanner filehandler = new Scanner(file)) {
            currentCount = 0;
            while (filehandler.hasNextLine() && currentCount < MAX) {
                String line = filehandler.nextLine();
                if (line.trim().isEmpty())
                    continue; // skip blank lines

                // split data by comma
                String[] tokens = line.split(",");
                studentIDs[currentCount] = Integer.parseInt(tokens[0]);
                studentNames[currentCount] = tokens[1];
                studentAges[currentCount] = Integer.parseInt(tokens[2]);
                studentMarks[currentCount] = Double.parseDouble(tokens[3]);
                studentAttendance[currentCount] = Integer.parseInt(tokens[4]);
                currentCount++;
            }
        } catch (Exception e) {
            System.out.println("Error loading data from file!");
        }
    }

    // save current arrays to txt file
    public static void saveDataToFile() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME))) {
            for (int i = 0; i < currentCount; i++) {
                // writing in csv format: id,name,age,marks,attendance
                writer.println(studentIDs[i] + "," +
                        studentNames[i] + "," +
                        studentAges[i] + "," +
                        studentMarks[i] + "," +
                        studentAttendance[i]);
            }
        } catch (IOException e) {
            System.out.println("Error saving data to file!");
        }
    }

    // load teacher credentials from file
    public static void loadCredentials() {
        File file = new File(CRED_FILE);
        if (!file.exists()) {
            saveCredentials(); // create file with default login if it doesn't exist
            return;
        }
        try (Scanner filehandler = new Scanner(file)) {
            if (filehandler.hasNextLine()) {
                String line = filehandler.nextLine();
                String[] tokens = line.split(",");
                if (tokens.length == 2) {
                    teacherID = tokens[0];
                    teacherPassword = tokens[1];
                }
            }
        } catch (Exception e) {
            System.out.println("Error loading credentials!");
        }
    }

    // save teacher credentials to file
    public static void saveCredentials() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(CRED_FILE))) {
            writer.println(teacherID + "," + teacherPassword);
        } catch (IOException e) {
            System.out.println("Error saving credentials!");
        }
    }

    // student login and validation
    public static void studentMenu() {
        System.out.println("\n--- Student Login ---");
        if (currentCount == 0) {
            System.out.println("No records in the system yet.");
            return;
        }

        int searchid = 0;
        try {
            System.out.print("Enter your student ID to login: ");
            searchid = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID! ID must be an integer number.");
            return;
        }

        int foundindex = -1;
        for (int i = 0; i < currentCount; i++) {
            if (studentIDs[i] == searchid) {
                foundindex = i;
                break;
            }
        }

        if (foundindex != -1) {
            System.out.println("Login successful! WELCOME, " + studentNames[foundindex] + " !!!");
            studentDashboard(foundindex);
        } else {
            System.out.println("Student ID not found. Login failed!");
        }
    }

    // separate method for student operations loop
    public static void studentDashboard(int index) {
        int op = -1;
        do {
            System.out.println("\n--- Student Dashboard ---");
            System.out.println("1. View Report Card");
            System.out.println("2. Export Report Card to File");
            System.out.println("0. Log Out");
            System.out.print("Select operation: ");

            try {
                op = Integer.parseInt(input.nextLine());
                switch (op) {
                    case 1:
                        printReportCard(index);
                        break;
                    case 2:
                        exportReportCard(index);
                        break;
                    case 0:
                        System.out.println("Exiting Student Dashboard...");
                        break;
                    default:
                        System.out.println("Invalid operation! Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
                op = -1;
            }
        } while (op != 0);
    }

    // grade calculator
    public static String[] calculateGrade(double m) {
        String letter = "F";
        double gradePoint = 0.0;
        String status = "FAIL";

        if (m >= 85) {
            letter = "A";
            gradePoint = 4.0;
            status = "PASS (Excellent)";
        } else if (m >= 80) {
            letter = "A-";
            gradePoint = 3.7;
            status = "PASS";
        } else if (m >= 75) {
            letter = "B+";
            gradePoint = 3.3;
            status = "PASS";
        } else if (m >= 71) {
            letter = "B";
            gradePoint = 3.0;
            status = "PASS";
        } else if (m >= 68) {
            letter = "B-";
            gradePoint = 2.7;
            status = "PASS";
        } else if (m >= 64) {
            letter = "C+";
            gradePoint = 2.3;
            status = "PASS";
        } else if (m >= 61) {
            letter = "C";
            gradePoint = 2.0;
            status = "PASS";
        } else if (m >= 58) {
            letter = "C-";
            gradePoint = 1.7;
            status = "PASS";
        } else if (m >= 50) {
            letter = "D";
            gradePoint = 1.3;
            status = "PASS (Minimum Passing)";
        } else {
            letter = "F";
            gradePoint = 0.0;
            status = "FAIL";
        }

        return new String[] { status, letter, String.valueOf(gradePoint) };
    }

    // sub-method to just print report card on console
    public static void printReportCard(int index) {
        System.out.println("\n====================================");
        System.out.println("          STUDENT REPORT CARD      ");
        System.out.println("====================================");
        System.out.println("ID:         " + studentIDs[index]);
        System.out.println("Name:       " + studentNames[index]);
        System.out.println("Age:        " + studentAges[index]);
        System.out.println("Marks:      " + studentMarks[index] + " / 100");
        System.out.println("Attendance: " + studentAttendance[index] + "%");
        System.out.println("====================================");

        String[] gradeData = calculateGrade(studentMarks[index]);
        String status = gradeData[0];
        String letter = gradeData[1];
        String gradePoint = gradeData[2];

        System.out.println("Status: " + status);
        System.out.println("Letter Grade: " + letter + "    Grade Point: " + gradePoint);
        System.out.println("====================================");
    }

    // sub-method to export report card to text file
    public static void exportReportCard(int index) {
        String filename = studentIDs[index] + "_report.txt";
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            writer.println("====================================");
            writer.println("         STUDENT REPORT CARD      ");
            writer.println("====================================");
            writer.println("ID:         " + studentIDs[index]);
            writer.println("Name:       " + studentNames[index]);
            writer.println("Age:        " + studentAges[index]);
            writer.println("Marks:      " + studentMarks[index] + " / 100");
            writer.println("Attendance: " + studentAttendance[index] + "%");
            writer.println("====================================");

            String[] gradeData = calculateGrade(studentMarks[index]);
            String status = gradeData[0];
            String letter = gradeData[1];
            String gradePoint = gradeData[2];

            writer.println("Status: " + status);
            writer.println("Letter Grade: " + letter + "    Grade Point: " + gradePoint);
            writer.println("====================================");
            System.out.println("Report exported successfully to " + filename);
        } catch (IOException e) {
            System.out.println("Error exporting report card!");
        }
    }

    public static void main(String[] args) throws IOException {
        loadDataFromFile();
        loadCredentials();

        int identity = 0;
        boolean keepRunning = true;

        while (keepRunning) {
            try {
                System.out.println("\n=== STUDENT MANAGEMENT SYSTEM ===");
                System.out.println("1. Teacher Login");
                System.out.println("2. Student View");
                System.out.println("0. Exit Program");
                System.out.print("Enter identity: ");
                identity = Integer.parseInt(input.nextLine());

                switch (identity) {
                    case 1:
                        if (teacherLogin()) {
                            teacherMenu();
                        }
                        break;
                    case 2:
                        studentMenu();
                        break;
                    case 0:
                        keepRunning = false;
                        break;
                    default:
                        System.out.println("Invalid identity! Please enter 1, 2, or 0.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a number.");
            }
        }

        saveDataToFile();
        System.out.println("Data saved successfully. Goodbye!");
    }
}