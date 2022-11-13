public class DoublyLinkedList {
	private Node head;
	private int size;
	
	public DoublyLinkedList() {
		head = null;
		size = 0;
	}
	
	public int size() {
		return size;
	}
	
	public Node getHead() {
		return head;
	}
	
	public MyPQ getData() {
		return head.getData();
	}
	
	public boolean isEmpty() {
		return head == null;
	}
	
	public void addFirst(MyPQ data) {
		if (head == null) {
			head = new Node(null, data, null);
		}
		else {
			Node newNode = new Node(null, data, head);
			head.previous = newNode;
			head = newNode;
		}
		size++;
	}
	
	public void addLast(MyPQ data) {
		if (head == null) {
			head = new Node(null, data, null);
		}
		else {
			Node current = head;
			while(current.next != null) {
				current = current.next;
			}
			Node newNode = new Node(current, data, null);
			current.next = newNode;
		}
		size++;
	}
	
	public void removeFirst() {
		if (head == null) {
			return;
		}
		
		if (size == 1) {
			head = null;
			size--;
		}
		else {
			head = head.next;
			head.previous = null;
			size--;
		}
	}
	
	public void insertBefore(MyPQ data, int position) {
		if (head == null) {
			return;
		}
		if (position < 1 || position > size) {
			return;
		}
		
		Node current = head;
		int idx = 1;
		
		while(idx < position) {
			current = current.next;
			idx++;
		}
		if (current.previous == null) {
			Node newNode = new Node(null, data, current);
			current.previous = newNode;
			head = newNode;
		}
		else {
			Node newNode = new Node(current.previous, data, current);
			current.previous.next = newNode;
			current.previous = newNode;
		}
		size++;
	}
	
	public void removePosition(int position) {
		if (head == null) {
			return;
		}
		if (position < 1 || position > size) {
			return;
		}
		
		Node current = head;
		int idx = 1;
		while(idx < position) {
			current = current.next;
			idx++;
		}
		
		if (current.next == null) {
			current.previous.next = null;
		}
		else if (current.previous == null) {
			current = current.next;
			current.previous = null;
			head = current;
		}
		else {
			current.previous.next = current.next;
			current.next.previous = current.previous;
		}
		size--;
	}
	
	public void print() {
		Node thisNode = head;
		while(thisNode != null) {
			System.out.println("Key: " + thisNode.getData().key);
			System.out.println("Value: " + thisNode.getData().value);
			System.out.println("\n");
			thisNode = thisNode.next;
		}
	}
}
