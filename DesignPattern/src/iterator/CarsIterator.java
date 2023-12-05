package iterator;

public class CarsIterator implements Iterator {

	String[] cars;
	int currIndex;
	
	CarsIterator(String[] cars) {
		this.cars = cars;
	}
	
	@Override
	public boolean hasNext() {
		if (currIndex>3) {
			return false;
		} else {
			return true;
		}
		
	}
	
	@Override
	public Object next() {
		return cars[currIndex++];
	}
	
}
