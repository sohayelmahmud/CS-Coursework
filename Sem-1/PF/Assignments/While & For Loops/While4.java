import java.util.Scanner;

public class While4 {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);

        System.out.println("     *** Area & Volume of Cylinder Calculator ***");

        System.out.print("Enter radius of Cylinder: ");
        double rad = value.nextDouble();

        while (rad <= 0) {
            System.out.println("Wrong input!");
            System.out.print("Again, enter radius of Cylinder: ");
            rad = value.nextDouble();
        }

        double area = Math.PI * rad * rad;
        System.out.printf("%nArea of Cylinder with Radius %.2f is: %.2f%n", rad, area);
    }
}
