import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\t --- Today and Future Day ---");
        System.out.print("Enter today's day (0 for sunday and so on): ");
        byte todayNum = inp.nextByte();

        System.out.print("Enter the number of days elapsed since today: ");
        short daysPassed = inp.nextShort();

        String today = today(todayNum);
        String futureDay = futureDay(todayNum, daysPassed);
        System.out.printf("Today is: %s%nFuture Day is: %s", today, futureDay);
    }

    public static String futureDay(byte todayNum, short daysPassed) {
        byte modulo7 = (byte) ((todayNum + daysPassed) % 7);
        String futureDay = "";
        switch (modulo7) {
            case 0:
                futureDay = "Sunday";
                break;
            case 1:
                futureDay = "Monday";
                break;
            case 2:
                futureDay = "Tuesday";
                break;
            case 3:
                futureDay = "Wednesday";
                break;
            case 4:
                futureDay = "Thursday";
                break;
            case 5:
                futureDay = "Friday";
                break;
            default:
                futureDay = "Saturday";
                break;
        }
        return futureDay;
    }

    public static String today(byte todayNum) {
        String today = "";
        switch (todayNum) {
            case 0:
                today = "Sunday";
                break;
            case 1:
                today = "Monday";
                break;
            case 2:
                today = "Tuesday";
                break;
            case 3:
                today = "Wednesday";
                break;
            case 4:
                today = "Thursday";
                break;
            case 5:
                today = "Friday";
                break;

            default:
                today = "Saturday";
                break;
        }
        return today;
    }

}