import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class MyPQUnsortedArray {

	private MyPQ[] source = new MyPQ[1];
	private MyPQ[] destination = new MyPQ[0];
	private int size = 0;

	MyPQUnsortedArray() {};

	MyPQUnsortedArray(Datasize option) throws FileNotFoundException {

		Random random = new Random();

		switch (option) {
		default:
		case XSmall: {
			File file = new File("xsmall.txt");
			Scanner scan = new Scanner(file);

			while (scan.hasNextLine()) {
				int K = 1 + random.nextInt(10);
				insert(K, scan.nextLine());
			}
			scan.close();
			break;
		}
		case Small: {
			File file = new File("small.txt");
			Scanner scan = new Scanner(file);

			while (scan.hasNextLine()) {
				int K = 1 + random.nextInt(100);
				insert(K, scan.nextLine());
			}
			scan.close();
			break;
		}
		case Medium: {
			File file = new File("medium.txt");
			Scanner scan = new Scanner(file);

			while (scan.hasNextLine()) {
				int K = 1 + random.nextInt(1000);
				insert(K, scan.nextLine());
			}
			scan.close();
			break;
		}
		case Large: {
			File file = new File("large.txt");
			Scanner scan = new Scanner(file);

			while (scan.hasNextLine()) {
				int K = 1 + random.nextInt(10000);
				insert(K, scan.nextLine());
			}
			scan.close();
			break;
		}
		case XLarge: {
			File file = new File("xlarge.txt");
			Scanner scan = new Scanner(file);

			while (scan.hasNextLine()) {
				int K = 1 + random.nextInt(100000);
				insert(K, scan.nextLine());
			}
			scan.close();
			break;
		}
		case Huge: {
			File file = new File("huge.txt");
			Scanner scan = new Scanner(file);

			while (scan.hasNextLine()) {
				int K = 1 + random.nextInt(1000000);
				insert(K, scan.nextLine());
			}
			scan.close();
			break;
		}
		}
	}

	public void insert(int K, String V) {
		if (source.length == 0 && destination.length == size) {
			source = new MyPQ[destination.length*2];
			
			for (int idx = 0; idx < destination.length; ++idx) {
				source[idx] = destination[idx];
			}
			
			destination = new MyPQ[0];
		}
		else if (destination.length == 0 && source.length == size) {
			destination = new MyPQ[source.length*2];
			
			for (int idx = 0; idx < source.length; ++idx) {
				destination[idx] = source[idx];
			}
			
			source = new MyPQ[0];
		}
		
		MyPQ temp = new MyPQ(K, V);
		
		if (source.length == 0) {
			destination[size] = temp;
			size++;
		}
		else if (destination.length == 0){
			source[size] = temp;
			size++;
		}
	}

	public MyPQ min() {
		if (size == 0) {
			return null;
		}
		else if (destination.length == 0) {
			int tempKey = source[0].key;
			int tempIdx = 0;
	
			for (int idx = 1; idx < size; ++idx) {
				if (source[idx].key < tempKey) {
					tempKey = source[idx].key;
					tempIdx = idx;
				}
			}
			
			return source[tempIdx];
		}
		else if (source.length == 0) {
			int tempKey = destination[0].key;
			int tempIdx = 0;
	
			for (int idx = 1; idx < size; ++idx) {
				if (destination[idx].key < tempKey) {
					tempKey = destination[idx].key;
					tempIdx = idx;
				}
			}
			
			return destination[tempIdx];
		}
		
		return null;
	}
	 
	public MyPQ removeMin() {
		int tempIdx = 0;
		MyPQ tempPQ = new MyPQ();
		
		if (size == 0) {
			return null;
		}
		else if (destination.length == 0) {
			int tempKey = source[0].key;
	
			for (int idx = 1; idx < size; ++idx) {
				if (source[idx].key < tempKey) {
					tempKey = source[idx].key;
					tempIdx = idx;
				}
			}
			
			tempPQ = source[tempIdx];
			
			for (int idx = tempIdx; idx < size - 1; ++idx) {
				source[idx] = source[idx + 1];
			}
			
			size--;
			
			if (size <= source.length/4) {
				destination = new MyPQ[source.length/2];
				
				for (int idx = 0; idx < size; ++idx) {
					destination[idx] = source[idx];
				}
				
				source = new MyPQ[0];
			}
		}
		else if (source.length == 0) {
			int tempKey = destination[0].key;
	
			for (int idx = 1; idx < size; ++idx) {
				if (destination[idx].key < tempKey) {
					tempKey = destination[idx].key;
					tempIdx = idx;
				}
			}
			
			tempPQ = destination[tempIdx];
			
			for (int idx = tempIdx; idx < size - 1; ++idx) {
				destination[idx] = destination[idx + 1];
			}
			
			size--;
			
			if (size <= destination.length/4) {
				source = new MyPQ[destination.length/2];
				
				for (int idx = 0; idx < size; ++idx) {
					source[idx] = destination[idx];
				}
				
				destination = new MyPQ[0];
			}
		}
		
		return tempPQ;
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		if (size == 0) {return true;}
		
		return false;
	}
}
