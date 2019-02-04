import java.util.Arrays;

public class Board {
    private Shape[] shap;
    
    public Board() {
		super();
		this.shap = new Shape[4];
	}

	public Shape[] getShap() {
		return shap;
	}

	public void setShap(Shape[] shap) {
		this.shap = shap;
	}

	public void addNewShape(int index, Shape shape) {
            shap[index] = shape;
    }

    public void delShape(int index) {
            shap[index] = null;
    }
    
    public double getArea() {
            double area = 0;
            for (Shape figure:shap
                 ) {
                    if (figure != null)
                    area += figure.getArea();
            }
            return area;
    }

    @Override
    public String toString() {
            return "Board = " + Arrays.toString(shap);
    }
}
