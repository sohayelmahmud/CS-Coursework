public class Task4 {
	public static void main(String[] args) {
		System.out.println("	--- Random UpperCase Letter --- ");

		byte letterIndex = (byte) (Math.random() * 26);
		System.out.println("Random Alphabet Character: " + (char)('A' + letterIndex));
	}
}