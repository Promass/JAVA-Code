import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

public class MyPQSortedList {

	DoublyLinkedList sortedList = new DoublyLinkedList();

	MyPQSortedList() {};

	MyPQSortedList(Datasize option) throws FileNotFoundException {

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
		
		Node currentNode = sortedList.getHead();
		int position = 0;
		
		for (int idx = 1; idx <= this.size(); ++idx) {
			if (currentNode.getData().key > K) {
				position = idx;
				break;
			}
			currentNode = currentNode.next;
		}
		
		if (position == 0) {
			if (sortedList.size() == 0) {
				sortedList.addFirst(tempPQ);
			}
			else {
				sortedList.addLast(tempPQ);
			}
		}
		else {
			sortedList.insertBefore(tempPQ, position);
		}
	}

	public MyPQ min() {
		return sortedList.getData();
	}
	 
	public MyPQ removeMin() {
		MyPQ tempPQ = sortedList.getData();
		sortedList.removeFirst();
		
		return tempPQ;
	}

	public int size() {
		return sortedList.size();
	}

	public boolean isEmpty() {
		return sortedList.isEmpty();
	}
}