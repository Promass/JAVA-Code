import java.util.ArrayList;

public class Entry {
	
	//Using ArrayList of a pair that has (key, value) as we need buckets
	public ArrayList<Pair> PairList = new ArrayList<Pair>();
	
	Entry() {};
	
	Entry(int k, String v) {
		Pair tempPair = new Pair(k, v);
		PairList.add(tempPair);
	}
	
	public String getValue(int k) {
		for (int idx = 0; idx < PairList.size(); ++idx) {
			if (PairList.get(idx).key == k) {
				return PairList.get(idx).value;
			}
		}
		
		return null;
	}
	
	public void addElement(int k, String v) {
		Pair tempPair = new Pair(k, v);
		PairList.add(tempPair);
	}
	
	public boolean removeElement(int k) {
		for (int idx = 0; idx < PairList.size(); ++idx) {
			if (PairList.get(idx).key == k) {
				PairList.remove(idx);
				return true;
			}
		}
		return false;
	}
	
}
