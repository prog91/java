package templeteMethod;

public class StringDisplay extends AbstractDisplay {

	String str;
	
	public StringDisplay(String str) {
	
	this.str = str;
}

	public void open() {
		
			System.out.println("<<");
		
	}
	
	public void print() {
		
		System.out.println(str);
		
	}
	
	public void close() {
		
		System.out.println(">>");
		
	}
	
}
