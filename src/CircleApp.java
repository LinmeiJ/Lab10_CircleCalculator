import java.util.Scanner;

/************@Author: Linmei Mills **********/
//this program takes an user input as the radius
//it calculates area and circumference of a circle 
//it displays the area, circumference, and number of circle that user has build.

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
