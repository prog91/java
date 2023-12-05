package state;

public class EvenState implements State {

	@Override
	public void handle(int ranNum) {
		if (ranNum%2  == 0) {
		System.out.println("짝수입니다.");
		}
	}

}
