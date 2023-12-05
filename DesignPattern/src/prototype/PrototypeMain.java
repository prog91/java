package prototype;

public class PrototypeMain {

	public static void main(String[] args) {
		
		Product product = ProductFactory.createProduct("배고팡");
		
		Manager manager = new Manager(product);
		
		Product cloneProduct = null;
		
		try {
		cloneProduct = (Product) manager.create();
		cloneProduct.use();
		} catch (CloneNotSupportedException cnse) {
			cnse.printStackTrace();
		}
	}
	
}
