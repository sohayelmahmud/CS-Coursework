public class Question4 {
    public static void main(String[] args) {
        System.out.println("Leap Years from 101 to 2100 are:");
        printLeapYears();
    }
    public static void printLeapYears() {
        byte line = 0;
        for (short year = 101; year <= 2100; year++) {
            if (isLeap(year)) {
                System.out.print(year + " ");
                line++;
            }
            if (line == 10) {
                System.out.println();
                line = 0;
            }
        }
    }
    public static boolean isLeap(short year) {
        if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
