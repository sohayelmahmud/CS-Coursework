public class OR3 {
    public static void main(String[] args) {
        int age = 21;

        if (age < 18 || age >= 65) {
            System.out.println("Eligible for special discounts and less taxes.");
        } else {
            System.out.println("Regular pricing will be applied with taxes.");
        }
    }
}

