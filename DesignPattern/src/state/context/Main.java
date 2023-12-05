package state.context;

import state.EvenState;
import state.MultipleOfThreeState;
import state.MultipleOfTwoState;
import state.OddState;

public class Main {

	public static void main(String[] args) {
		
		Context context = new NumContext();
		
		context.setState(new EvenState());
		context.generateRanNum();
		
		
		context.setState(new OddState());
		context.generateRanNum();
		
		context.setState(new MultipleOfThreeState());
		context.generateRanNum();
		
		context.setState(new MultipleOfTwoState());
		context.generateRanNum();
		
	}

	
}
