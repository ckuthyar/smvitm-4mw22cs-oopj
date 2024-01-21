package bank;

public interface Iterable<E> {
	public abstract Iterator<E> iterator();
}
public interface Iterator<E>{
	public abstract boolean hasNext();
	public abstract E next();
	public abstract void remove();
	}
public interface Collection<E> extends Iterable<E>{
	public abstract Iterator<E> iterator;
}
public class TestIterable1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
