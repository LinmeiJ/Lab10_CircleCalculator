import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Circle Tester");
		String userInputString = "y";
		int circNum = 0;  //initializing number of circles user have build
		while(userInputString.equalsIgnoreCase("y")) {

			double radius = Validator.getDouble(sc, "Enter Radius: ");
			Circle cc = new Circle(radius);
			System.out.println("Circumference: " + cc.getFormattedCircumference());
			System.out.println("Area: " + cc.getFormattedArea());
			circNum++;
			System.out.println("Continue?(y/n): ");
			userInputString = sc.nextLine();
		
		}
		System.out.println("You have build " + circNum + " circles in this program.Goodbye!");
	}
}
