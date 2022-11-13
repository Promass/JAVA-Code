public class MyHashMap extends AbsHashMap{

	MyHashMap(int cap) {
		super(cap);
	}
	
	private Entry[] table = new Entry[initialCapacity];
	private int currSize = 0;

	@Override
	public int size() {
		return currSize;
	}

	@Override
	public boolean isEmpty() {
		return (currSize == 0);
	}
	
	@Override
	public void printInfo(int k) {
		System.out.println("Initial Capacity: " + initialCapacity);
		System.out.println("Current Size: " + currSize);
		System.out.println("Number of Collisions: " + collisionCounter);
		System.out.println("Number of Items in the Bucket: " + (table[hashCode(k)].PairList.size()));
	}

	@Override
	public String get(int k) {
		if (table[hashCode(k)] == null) {
			return null;
		}
		
		return table[hashCode(k)].getValue(k);
	}

	@Override
	public String put(int k, String v) {
		if (table[hashCode(k)] == null) {
			Entry tempEntry = new Entry(k, v);
			table[hashCode(k)] = tempEntry;
			currSize++;
			printInfo(k);
			return null;
		}
		else {
			if (table[hashCode(k)].PairList.size() > 0) {
				collisionCounter++;
			}
			table[hashCode(k)].addElement(k, v);
			currSize++;
			printInfo(k);
			return null;
		}
	}

	@Override
	public String remove(int k) {
		String tempStr = null;
		
		if (table[hashCode(k)] == null) {
			return null;
		}
		else {
			if (table[hashCode(k)].getValue(k) != null) {
				tempStr = table[hashCode(k)].getValue(k);
				if (table[hashCode(k)].PairList.size() > 1) {
					if (table[hashCode(k)].removeElement(k)) {
						currSize--;
						collisionCounter--;
					}
					else {
						currSize--;
					}
				}
				else {
					table[hashCode(k)].removeElement(k);
					currSize--;
					table[hashCode(k)] = null;
				}
			}
		}
		
		return tempStr;
	}
}
