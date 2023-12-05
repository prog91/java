package prototype;

public interface Product extends Cloneable {

	public abstract Object createClone() throws CloneNotSupportedException;
	
	public abstract void use();
	
	
	
}
