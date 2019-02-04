
public class Triangle extends Shape{
	
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a, Point b, Point c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public Triangle() {
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
	
	@Override
	double getPerimetr() {
		return Point.Dist(a, b)+Point.Dist(b, c)+Point.Dist(c, a);
	}

	@Override
	double getArea() {
		return Math.sqrt(this.getPerimetr()*(this.getPerimetr()-Point.Dist(a, b))*(this.getPerimetr()-Point.Dist(b, c))*(this.getPerimetr()-Point.Dist(c, a)));
	}

	@Override
	public String toString() {
		return "Triangle points are a = " + a + ", b =" + b + ", c =" + c;
	}	

}
