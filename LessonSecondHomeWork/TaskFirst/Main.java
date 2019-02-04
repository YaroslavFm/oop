
public class Main {

	public static void main(String[] args) {
		Point pointOne = new Point(0, 2);
        Point pointTwo = new Point(1, 3);
        Point pointThree = new Point(2, 7);
        Point pointFour = new Point(3, 3);
        Board board = new Board();
		
		Shape triangle = new Triangle(pointOne, pointThree, pointFour);
        System.out.println(triangle);
        System.out.println("Triangle perimetr is "+triangle.getPerimetr());
        System.out.println("Triangle area is "+triangle.getArea());
		System.out.println();
        Shape circle = new Circle(pointOne, pointFour);
        System.out.println(circle);
        System.out.println("Circle perimetr is "+circle.getPerimetr());
        System.out.println("Circle area is "+circle.getArea());
        System.out.println();
        Shape rectangle = new Rectangle(pointOne, pointTwo, pointFour, pointThree);
        System.out.println(rectangle);
        System.out.println("Rectangle perimetr is "+rectangle.getPerimetr());
        System.out.println("Rectangle area is "+rectangle.getArea());
        System.out.println();
        
        board.addNewShape(0, triangle);
        board.addNewShape(1, rectangle);
        board.delShape(0);
        board.addNewShape(2, circle);
        System.out.println(board);
        System.out.println("Total area " + board.getArea());
        


	}

}
