
public class Rectangle extends Shape {

	private Point a;
	private Point b;
	private Point c;
	private Point d;

	public Rectangle(Point a, Point b, Point c, Point d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public Rectangle() {
		super();
	}

	public Point getA() {
		return a;
	}

	public void setA(Point a) {
		this.a = a;
	}

	public Point getB() {
		return b;
	}

	public void setB(Point b) {
		this.b = b;
	}

	public Point getC() {
		return c;
	}

	public void setC(Point c) {
		this.c = c;
	}

	public Point getD() {
		return d;
	}

	public void setD(Point d) {
		this.d = d;
	}

	@Override
	double getPerimetr() {
		return Point.Dist(a, b)+Point.Dist(b, c)+Point.Dist(c, d)+Point.Dist(d, a);
	}

	@Override
	double getArea() {
		return Point.Dist(a, b)*Point.Dist(b, c);
	}

	@Override
	public String toString() {
		return "Rectangle points are a = " + a + ", b = " + b + ", c = " + c + ", d = " + d;
	}
	
	
}
