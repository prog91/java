package state;

public class MultipleOfThreeState implements State {

	@Override
	public void handle(int ranNum) {
		if (ranNum%3 ==0) {
		System.out.println("3의 배수입니다.");
		}
	}

}
