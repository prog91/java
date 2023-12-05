package state.context;

import state.State;

public class NumContext implements Context {

	private State currentState;
	
	@Override
	public void setState(State state) {
		this.currentState = state;

	}

	@Override
	public void generateRanNum() {
		int ranNum = (int) (Math.random()*10)+1;
		System.out.println("랜덤숫자 : " + ranNum);
		currentState.handle(ranNum);
	}

}
