import java.util.Scanner;

public class SwitchCase2 {
	public static void main(String[] args) {
		Scanner values = new Scanner(System.in);

		System.out.println("		--- Apple Distributer ---");
		System.out.print("No. of Students: ");
		int students = values.nextInt();

		System.out.print("No. of Apples: ");
		int apples = values.nextInt();
		values.close();
		
		int distributedApples = (int) (apples / students);
		int basketApples = apples % students;
		

		System.out.print("Each Student will get: " + distributedApples + "\nRemaining Apples in Basket are: " + basketApples);

	}
}