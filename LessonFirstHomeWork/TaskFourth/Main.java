
public class Main {

	public static void main(String[] args) {

		Phone phoneOne = new Phone("380631111111");
		Phone phoneTwo = new Phone("380632222222");
		Phone phoneThree = new Phone("380633333333");

		phoneOne.registerNetwork();
		phoneTwo.registerNetwork();
		phoneThree.registerNetwork();

		phoneOne.call("380632222222");
		phoneTwo.call("380631111111");
		phoneThree.call("380631111111");
		phoneThree.call("380635555555");

	}

}
