package iterator;


public class Cars implements Aggregate {
	
	String[] cars = new String[] {"부가티" , "페라리" , "아우디" , "포르쉐"};
	
	@Override
	public Object iterator() {
		return new CarsIterator(cars);
	}
	
}	