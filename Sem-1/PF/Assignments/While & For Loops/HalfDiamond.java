public class HalfDiamond {
    public static void main(String[] args) {
        int range = Integer.parseInt(System.console().readLine("Enter the length of Half-Diamond Pattern: "));

        for (int i = 1; i <= (range + 1); i++) {
            
            if (i > range/2) {
                System.out.println("*".repeat(((range+1) - i)*2 - 1));
            }
            else {
                System.out.println("*".repeat(i*2 - 1));
            }
        }
    }
}