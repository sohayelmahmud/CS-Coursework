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
        System.out.printf("\nTime is: %02d:%02d:%02d\n", hours, minutes, seconds);
    }

    public void displayTime12hFormat() {
        String meridien = (hours >= 12) ? "pm" : "am";
        int displayHours = hours % 12;
        if (displayHours == 0) {
            displayHours = 12;
        }

        System.out.printf("\nTime is: %02d:%02d:%02d %s\n", displayHours, minutes, seconds, meridien);
    }
}

public class LabTask2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Time t1 = new Time();

        System.out.print("Enter Hours (0-23): ");
        int h = scanner.nextInt();

        System.out.print("Enter Minutes (0-59): ");
        int m = scanner.nextInt();

        System.out.print("Enter Seconds (0-59): ");
        int s = scanner.nextInt();

        t1.setTime(h, m, s);
        t1.displayTime24hFormat();

        scanner.close();
    }
}