import java.util.Scanner;

public class RoomCalculator {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String choice;
		do {

			System.out.println("Enter the length of the room");
			double length = scan.nextDouble();
			System.out.println("Enter the width of the room");
			double width = scan.nextDouble();
			System.out.println("Enter the height of the room");
			double height = scan.nextDouble();
			System.out.println("The area of the room is " + (length * width));
			System.out.println("The perimeter of the room is " + (length + length + width + width));
			System.out.println("The height of the room is " + (length * width * height));
			System.out.println("Would you like to continue? Enter y for Yes or n for No");
			choice = scan.nextLine();
		} while (choice == "y");

	}

}
