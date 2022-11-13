public abstract class AbsHashMap {
	
	AbsHashMap(int cap) { initialCapacity = cap;};
	
	protected int initialCapacity;
	protected int collisionCounter = 0;
	
	public abstract int size();
	
	public abstract boolean isEmpty();
	
	public abstract void printInfo(int k);
	
	public abstract String get(int k);
	
	public abstract String put(int k, String v);
	
	public abstract String remove(int k);

	public int hashCode(int key) {
		return key%initialCapacity;
	}
}
