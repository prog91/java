package state;

public class MultipleOfTwoState implements State {

	@Override
	public void handle(int ranNum) {
		if (ranNum%2 ==0) {
		System.out.println("2의 배수입니다.");
		}
	}

}
