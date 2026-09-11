import java.util.Random;

public class DiceRoll {
    public static void main(String[] args) {
        Random num = new Random();
        System.out.println("\t --- Dice Roll Count ---");
        int roll, count = 0;

        do {
            roll = num.nextInt(1, 7);
            System.out.println("Roll: " + roll);
            count++;
        } while (roll != 6);
        System.out.println(count + " rolls were taken to get a 6.");
    }
}