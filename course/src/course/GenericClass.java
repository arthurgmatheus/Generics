package course;

public class GenericClass <T> {

	
	private T value;
	
	public void add(T value) {
		this.value = value;
	}

	public T getValue() {
		return value;
	}
	
	
	
}
