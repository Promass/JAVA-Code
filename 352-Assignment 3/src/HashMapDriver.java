import java.util.ArrayList;
import java.util.Random;

public class HashMapDriver {
	
	static long start;
	static long end;

	HashMapDriver() {}
	
	static void validate() {
		
		//Creating random keys and values
		Random rand = new Random();
		int[] keyList = new int[50];
		ArrayList<String> valueList = new ArrayList<String>();
		for (int idx = 0; idx < 50; ++idx) {
			keyList[idx] = rand.nextInt(100000)+50;
			valueList.add("#" + idx);
		}
		
		//Creating MyHashMap
		MyHashMap map = new MyHashMap(100);
		
		System.out.println("\n********************************************** MyHashMap with 50 Elements **********************************************\n");
		
		//Adding to MyHashMap
		for (int idx = 0; idx < 50; ++idx) {
			start = System.nanoTime();
			map.put(keyList[idx], valueList.get(idx));
			end = System.nanoTime();
			System.out.println("Time it took to run put function number " + (idx+1) + ": " + ((end-start)/1000) + "ms \n");
		}
		
		System.out.println("\n********************************************** get(k) 50 Times **********************************************\n");
		
		//Running get(k) on all 50 elements
		for (int idx = 0; idx < 50; ++idx) {
			start = System.nanoTime();
			System.out.println(map.get(keyList[idx]));
			end = System.nanoTime();
			System.out.println("Time it took to run get function number " + (idx+1) + ": " + ((end-start)/1000) + "ms \n");
		}
		
		System.out.println("\n********************************************** remove(k) 25 Times **********************************************\n");
		
		//Running remove(k) on the first 25 elements
		for (int idx = 0; idx < 25; ++idx) {
			start = System.nanoTime();
			map.remove(keyList[idx]);
			end = System.nanoTime();
			System.out.println("Time it took to run remove function number " + (idx+1) + ": " + ((end-start)/1000) + "ms \n");
		}
		
		System.out.println("\n********************************************** get(k) 50 Times **********************************************\n");
		
		//Running get(k) again on all 50 elements
		for (int idx = 0; idx < 50; ++idx) {
			start = System.nanoTime();
			System.out.println(map.get(keyList[idx]));
			end = System.nanoTime();
			System.out.println("Time it took to run get function number " + (idx+1) + ": " + ((end-start)/1000) + "ms \n");
		}
	}
	
	static void interpret() {
		//Creating MyHashMap
		MyHashMap map = new MyHashMap(100);
		
		//Creating 150 random keys and values
		Random rand = new Random();
		int[] keyList = new int[150];
		ArrayList<String> valueList = new ArrayList<String>();
		for (int idx = 0; idx < 150; ++idx) {
			keyList[idx] = rand.nextInt(100000)+150;
			valueList.add("#" + idx);
		}
		
		System.out.println("\n********************************************** MyHashMap with 25 Elements **********************************************\n");
		
		//Adding to 25 elements to MyHashMap
		for (int idx = 0; idx < 25; ++idx) {
			start = System.nanoTime();
			map.put(keyList[idx], valueList.get(idx));
			end = System.nanoTime();
			System.out.println("Time it took to run put function number " + (idx+1) + ": " + ((end-start)/1000) + "ms \n");
		}
		
		//resetting MyHashMap
		map = new MyHashMap(100);
		
		System.out.println("\n********************************************** MyHashMap with 50 Elements **********************************************\n");
		
		//Adding to 50 elements to MyHashMap
		for (int idx = 0; idx < 50; ++idx) {
			start = System.nanoTime();
			map.put(keyList[idx], valueList.get(idx));
			end = System.nanoTime();
			System.out.println("Time it took to run put function number " + (idx+1) + ": " + ((end-start)/1000) + "ms \n");
		}
		
		//resetting MyHashMap
		map = new MyHashMap(100);
		
		System.out.println("\n********************************************** MyHashMap with 75 Elements **********************************************\n");
		
		//Adding to 75 elements to MyHashMap
		for (int idx = 0; idx < 75; ++idx) {
			start = System.nanoTime();
			map.put(keyList[idx], valueList.get(idx));
			end = System.nanoTime();
			System.out.println("Time it took to run put function number " + (idx+1) + ": " + ((end-start)/1000) + "ms \n");
		}
		
		//resetting MyHashMap
		map = new MyHashMap(100);
		
		System.out.println("\n********************************************** MyHashMap with 100 Elements **********************************************\n");
		
		//Adding to 100 elements to MyHashMap
		for (int idx = 0; idx < 100; ++idx) {
			start = System.nanoTime();
			map.put(keyList[idx], valueList.get(idx));
			end = System.nanoTime();
			System.out.println("Time it took to run put function number " + (idx+1) + ": " + ((end-start)/1000) + "ms \n");
		}
		
		//resetting MyHashMap
		map = new MyHashMap(100);
		
		System.out.println("\n********************************************** MyHashMap with 125 Elements **********************************************\n");
		
		//Adding to 125 elements to MyHashMap
		for (int idx = 0; idx < 125; ++idx) {
			start = System.nanoTime();
			map.put(keyList[idx], valueList.get(idx));
			end = System.nanoTime();
			System.out.println("Time it took to run put function number " + (idx+1) + ": " + ((end-start)/1000) + "ms \n");
		}
		
		//resetting MyHashMap
		map = new MyHashMap(100);
		
		System.out.println("\n********************************************** MyHashMap with 150 Elements **********************************************\n");
		
		//Adding to 150 elements to MyHashMap
		for (int idx = 0; idx < 150; ++idx) {
			start = System.nanoTime();
			map.put(keyList[idx], valueList.get(idx));
			end = System.nanoTime();
			System.out.println("Time it took to run put function number " + (idx+1) + ": " + ((end-start)/1000) + "ms \n");
		}
	}
}
