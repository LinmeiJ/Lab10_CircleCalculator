import java.util.Scanner;

public class CircleApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the Circle Tester");
		String userInputString = "y";
	
		while(userInputString.equalsIgnoreCase("y")) {

			double radius = Validator.getDouble(sc, "Enter Radius: ");
			Circle cc = new Circle(radius);
			System.out.println("Circumference: " + cc.getFormattedCircumference());
			System.out.println("Area: " + cc.getFormattedCircumference());
			
			System.out.println("Continue?(y/n): ");
			userInputString = sc.nextLine();
		}
		System.out.println("Goodbye!");
	}
}
