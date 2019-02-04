
public class Circle extends Shape{
	
	private Point center;
	private Point radius;

	public Circle(Point center, Point radius) {
		super();
		this.center = center;
		this.radius = radius;
	}

	public Circle() {
		super();
	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public Point getRadius() {
		return radius;
	}

	public void setRadius(Point radius) {
		this.radius = radius;
	}

	@Override
	double getPerimetr() {
		return 2*Math.PI*Point.Dist(radius, center);
	}

	@Override
	double getArea() {
		
		return Math.PI*Point.Dist(radius, center)*Point.Dist(radius, center);
	}

	@Override
	public String toString() {
		return "Circle points are center = " + center + ", radius = " + radius;
	}

}
