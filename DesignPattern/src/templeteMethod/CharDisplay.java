package templeteMethod;

public class CharDisplay extends AbstractDisplay {
	
	char ch;
	
	public CharDisplay(char ch) {
		
		this.ch = ch;
	}

	public void open() {
		System.out.println("<<");
	}
	
	public void print() {
		for(int i=0; i<=5; i++)
		System.out.println(ch);
	}
	
	public void close() {
		System.out.println(">>");
	}
}
