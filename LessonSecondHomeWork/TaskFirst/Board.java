
import java.util.Arrays;

public class Board {
	private Shape[] board = new Shape[4];
    
    public Board(Shape[] board) {
		super();
		this.board = board;
	}

	public Board() {
		super();
	}

	public void addNewShape(int index, Shape shape) {
            board[index] = shape;
    }

    public void delShape(int index) {
            board[index] = null;
    }
    
    public double getArea() {
            double area = 0;
            for (Shape figure:board
                 ) {
                    if (figure != null)
                    area += figure.getArea();
            }
            return area;
    }

    @Override
    public String toString() {
            return "Board = " + Arrays.toString(board);
    }
}
