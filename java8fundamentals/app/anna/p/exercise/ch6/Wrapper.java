package anna.p.exercise.ch6;

public class Wrapper<T> {
	private T obj;
	
	public Wrapper(T obj) {
		this.obj = obj;
	}
	
	public T get() {
		return obj;
	}
	
	public void set(T obj) {
		this.obj = obj;
	}
}
