
import java.util.ArrayList;

public class Phone {
	
	private String number;

	public Phone() {

	}

	public Phone(String number) {
		this.number = number;
	}

	public void registerNetwork() {
		Network.addNumber(number);
	}

	public void call(String numberCall) {
		ArrayList<String> networkNumbers = Network.getNumbers();

		for (int i = 0; i < networkNumbers.size(); i++) {
			String availableNumber = networkNumbers.get(i);

			if (availableNumber.equals(numberCall)) {
				System.out.println("You are calling from " + number + " to " + numberCall);
				break;
			} else if (i == (networkNumbers.size() - 1)) {
				System.out.println("You number is wrong. Do you want to try again?");
			}

		}

	}
}
