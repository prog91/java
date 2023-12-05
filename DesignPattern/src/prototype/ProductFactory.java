package prototype;

public class ProductFactory {
	
	public static Product createProduct(String str) {
		return new MessageBox(str);
	}

}
