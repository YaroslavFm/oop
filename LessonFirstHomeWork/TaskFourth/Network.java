import java.util.ArrayList;

public class Network {
	
	private static ArrayList<String> numbers = new ArrayList<>();

	public static void addNumber(String number) {
		numbers.add(number);
	}

	public static ArrayList<String> getNumbers() {
		return numbers;
	}

}
