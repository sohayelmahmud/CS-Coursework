import java.util.Scanner;

public class Hotel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean[][] rooms = new boolean[10][5];
        int choice = 0;


        while (choice != 4) {
            System.out.println("\n1. Book Room\n2. Checkout Room\n3. View Rooms\n4. Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();


            if (choice == 1 || choice == 2) {
                System.out.print("Enter floor (1-10): ");
                int f = input.nextInt() - 1;
                System.out.print("Enter room (1-5): ");
                int r = input.nextInt() - 1;

                if (choice == 1) {
                    if (!rooms[f][r]) {
                        rooms[f][r] = true;
                        System.out.println("Room Booked");
                    } else {
                        System.out.println("Room Already Occupied");
                    }
                } else {
                    rooms[f][r] = false;
                    System.out.println("Checkout Successful");
                }
            }

            else if (choice == 3) {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Floor " + (i + 1));
                    for (int j = 0; j < 5; j++) {
                        String status = rooms[i][j] ? "Occupied" : "Available";
                        System.out.println("  Room " + (j + 1) + " : " + status);
                    }
                }
            }
        } 

        System.out.println("Thank you for using our system!");
        input.close();
    }
}
