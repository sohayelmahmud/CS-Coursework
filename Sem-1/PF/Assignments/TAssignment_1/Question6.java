public class Question6 {
    public static void main(String[] args) {
        System.out.println("\t --- Random Month ---");
        byte randMon = (byte) (Math.random() * 13);

        String month = monthReturn(randMon);
        System.out.printf("Month No: %d%nMonth Name: %s", randMon, month);
    }

    private static String monthReturn(byte randMon) {
        String month = "";
        switch (randMon) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;
            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            case 8:
                month = "August";
                break;
            case 9:
                month = "September";
                break;
            case 10:
                month = "October";
                break;
            case 11:
                month = "November";
                break;
            default:
                month = "December";
                break;
        }
        return month;
    }
}