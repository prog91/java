package state;

public class OddState implements State {

	@Override
	public void handle(int ranNum) {
		if (ranNum%2 != 0) {
		System.out.println("홀수입니다.");
		}
	}

}
