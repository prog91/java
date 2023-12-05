package iterator;

public class CarsMain {

	public static void main(String[] args) {
		
		Aggregate aggregate = new Cars();
		Iterator iterator = (Iterator)aggregate.iterator();
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}
	
}
