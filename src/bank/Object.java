package bank;

public class Object {
	public boolean equals(Object o) {
		return this==o;
	}
	public String toString() {
		return getClass().getName()+"@"+Integer.toHexString(hashCode());
	}
	public native int hashCode();
}
