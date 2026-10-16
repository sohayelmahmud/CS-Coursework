import java.util.Scanner;

class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public void setTime(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    public void displayTime24hFormat() {
        System.out.printf("\nTime is (in 24H format): %02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public void displayTime12hFormat() {
        String meridien;
        if (hours >= 12) {
            meridien = "pm";
        } else {
            meridien = "am";
        }
        int displayHours = hours % 12;
        if (displayHours == 0) {
            displayHours = 12;
        }

        System.out.printf("\nTime is (in 12H format): %02d:%02d:%02d %s\n", displayHours, minutes, seconds, meridien);
    }
}

public class LabTask2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Time t1 = new Time();

        System.out.print("Enter Hours (0-23): ");
        int h = input.nextInt();

        System.out.print("Enter Minutes (0-59): ");
        int m = input.nextInt();

        System.out.print("Enter Seconds (0-59): ");
        int s = input.nextInt();

        t1.setTime(h, m, s);

        System.out.print("In which format do you want to see the time?\n1. 24H format\n2. 12H format\nEnter 1 or 2: ");
        int choice = input.nextInt();
        if (choice == 1) {
            t1.displayTime24hFormat();
        } else {
            t1.displayTime12hFormat();
        }

        input.close();
    }
}