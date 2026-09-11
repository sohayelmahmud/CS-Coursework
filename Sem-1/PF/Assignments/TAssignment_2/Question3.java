public class Question3 {
    public static void main(String[] args) {
        System.out.println("\t --- Vehicle Plate Number Generator ---");
        System.out.println("Vehicle Plate Number: " + plateNumGen());
    }

    public static String plateNumGen() {
        char alpha1 = (char) ('A' + (int) (Math.random() * 26));
        char alpha2 = (char) ('A' + (int) (Math.random() * 26));
        char alpha3 = (char) ('A'+ (int) (Math.random() * 26));
        
        byte num1 = (byte) (Math.random() * 10);
        byte num2 = (byte) (Math.random() * 10);
        byte num3 = (byte) (Math.random() * 10);
        byte num4 = (byte) (Math.random() * 10);

        String plateNumber = alpha1 + "" + alpha2 + "" + alpha3 + "" + num1 + "" + num2
                                + "" + num3 + "" + num4;
        return plateNumber;
    }
}