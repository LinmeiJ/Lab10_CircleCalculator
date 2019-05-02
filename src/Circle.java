
public class Circle {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	private static String formatNumber(double x) {
		return String.format("%.2f", x);	
	}
	
//_______getter and setter to access the instance varible_________
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
//_________________________________________________
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String getFormattedCircumference() {
		double circ = getCircumference();
		return formatNumber(circ);	
	}
	
	public String getFormattedArea() {
		double area = getArea();
		return formatNumber(area);	
	}
	
	
}
