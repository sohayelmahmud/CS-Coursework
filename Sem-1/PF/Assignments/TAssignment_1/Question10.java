import java.util.Scanner;
public class Question10 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("\t --- No. of days in a Month ---");
        System.out.print("Enter the year: ");
        short year = inp.nextShort();

        System.out.print("Enter the month no.: ");
        byte monthNo = inp.nextByte();

        String month = "";
        byte days = 0;
        switch (monthNo) {
            case 1:
                month = "January";
                days = 31;
                break;
            case 2:
                month = "February";
                days = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0) ? (byte) 29 : (byte) 28;
                break;
            case 3:
                month = "March";
                days = 31;
                break;
            case 4:
                month = "April";
                days = 30;
                break;
            case 5:
                month = "May";
                days = 31;
                break;
            case 6:
                month = "June";
                days = 30;
                break;
            case 7:
                month = "July";
                days = 31;
                break;
            case 8:
                month = "August";
                days = 31;
                break;
            case 9:
                month = "September";
                days = 30;
                break;
            case 10:
                month = "October";
                days = 31;
                break;
            case 11:
                month = "November";
                days = 30;
                break;
            default:
                month = "December";
                days = 31;
                break;
        }
        System.out.println(month + " " + year + " has " + days + " days.");
    }
}