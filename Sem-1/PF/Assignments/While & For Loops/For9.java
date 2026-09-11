public class For9 {
    public static void main(String[] args) {
        int range = Integer.parseInt(System.console().readLine("Enter the length of Triangle: "));

        for (int i = 1; i <= range; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
