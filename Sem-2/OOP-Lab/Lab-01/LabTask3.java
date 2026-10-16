import java.util.Scanner;

class Car {
    private String brand;
    private String model;
    private String chesisNo;
    private String engineNo;
    private int menufecturedYear;
    private double engeenPower;

    public void setData(String brnd, String mod, String chesis, String engine, int year, double power) {
        brand = brnd;
        model = mod;
        chesisNo = chesis;
        engineNo = engine;
        menufecturedYear = year;
        engeenPower = power;
    }

    public void displayData() {
        System.out.println("\n--- Car Details---");
        System.out.println("Brand                : " + brand);
        System.out.println("Model                : " + model);
        System.out.println("Body No.             : " + chesisNo);
        System.out.println("Engine No.           : " + engineNo);
        System.out.println("Year of Menufecture  : " + menufecturedYear);
        System.out.printf("Engine power (in HP) : %.2f\n", engeenPower);

    }
}

public class LabTask3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Car car1 = new Car();

        System.out.print("Enter brand name: ");
        String brnd = input.nextLine();

        System.out.print("Enter model name: ");
        String mod = input.nextLine();

        System.out.print("Enter chesis no.: ");
        String chesis = input.nextLine();

        System.out.print("Enter engine no.: ");
        String engine = input.nextLine();

        System.out.print("Enter the year menufecturing: ");
        int year = input.nextInt();

        System.out.print("Enter the power of engine (in HP): ");
        double power = input.nextDouble();

        car1.setData(brnd, mod, chesis, engine, year, power);

        car1.displayData();

        input.close();
    }
}
