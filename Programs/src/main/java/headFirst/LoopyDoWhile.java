package headFirst;

public class LoopyDoWhile {

	public static void main(String[] args) {

		int x = 1;

		System.out.println("Before the loop");

		do {
			System.out.println("In the loop");

			System.out.println("The value of x is " + x);

			x = x + 1;

		} while (x < 4);

		System.out.println("This is after the loop");
	}
}
