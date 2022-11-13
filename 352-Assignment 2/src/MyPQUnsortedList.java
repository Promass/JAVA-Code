import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class MyPQUnsortedList {

	DoublyLinkedList unsortedList = new DoublyLinkedList();

	MyPQUnsortedList() {};

	MyPQUnsortedList(Datasize option) throws FileNotFoundException {

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
		MyPQ tempPQ = new MyPQ(K, V);
		unsortedList.addFirst(tempPQ);
	}

	public MyPQ min() {
		Node currentNode = unsortedList.getHead();
		int currentKey = currentNode.getData().key;
		int position = 0;
		int currPos = 1;
		
		for (int idx = 1; idx < this.size(); ++idx) {
			if (currentNode.getData().key < currentKey) {
				currentKey = currentNode.getData().key;
				position = idx;
			}
			currentNode = currentNode.next;
		}
		
		currentNode = unsortedList.getHead();
		
		if (position != 0) {
			while(currPos < position) {
				currentNode = currentNode.next;
				currPos++;
			}
		}
		
		return currentNode.getData();
	}
	 
	public MyPQ removeMin() {
		Node currentNode = unsortedList.getHead();
		Node tempNode = currentNode;
		int currentKey = currentNode.getData().key;
		int position = 0;
		
		for (int idx = 1; idx <= this.size(); ++idx) {
			if (currentNode.getData().key < currentKey) {
				currentKey = currentNode.getData().key;
				position = idx;
				tempNode = currentNode;
			}
			currentNode = currentNode.next;
		}
		
		if (position != 0) {
			unsortedList.removePosition(position);
			return tempNode.getData();
		}
		else {
			unsortedList.removeFirst();
			return tempNode.getData();
		}
	}

	public int size() {
		return unsortedList.size();
	}

	public boolean isEmpty() {
		return unsortedList.isEmpty();
	}
}