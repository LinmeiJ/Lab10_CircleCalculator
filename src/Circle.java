
public class Circle {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	private static String formatNumber(double x) {
		return String.format("%.2f", x);	
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getCircumference() {
		return 2 * Math.PI * radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
	
	public String getFormattedCircumference() {
		return formatNumber(getCircumference());	
	}
	
	public String getFormattedArea() {
		return formatNumber(getArea());	
	}
	
	
}
	
}
