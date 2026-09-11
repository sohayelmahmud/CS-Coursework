import java.util.Scanner;
public class Task1 {
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		final float earthRadius = 6371.01f;
		
		System.out.println("	--- Great Circle Distance --- ");
		System.out.println("Note: For north and west, write angle as it is\n" +
				"      To indicate south and east, use -ve sign with angle.");
		System.out.print("Enter Point 1 (lattitude and longitude) in degrees: ");
		float x1 = inp.nextFloat();
		float y1 = inp.nextFloat();

		System.out.print("Enter Point 2 (lattitude and longitude) in degrees: ");
		float x2 = inp.nextFloat();
		float y2 = inp.nextFloat();
		
		double x1Rad = Math.toRadians(x1);
		double y1Rad = Math.toRadians(y1);
		double x2Rad = Math.toRadians(x2);
		double y2Rad = Math.toRadians(y2);

		double distance = earthRadius * Math.acos(Math.sin(x1Rad) * Math.sin(x2Rad) + Math.cos(x1Rad) * Math.cos(x2Rad) * Math.cos(y1Rad - y2Rad));
		System.out.printf("Distance between (%.2f, %.2f) and (%.2f, %.2f) is: %.3fkm",
				   x1, y1, x2, y2, distance);
	}
}