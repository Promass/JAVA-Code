public class Node {
	private MyPQ data;
	public Node previous;
	public Node next;
	
	public Node(MyPQ data) {
		previous = null;
		this.data = data;
		next = null;
	}
	
	public Node(Node previous, MyPQ data, Node next) {
		this.previous = previous;
		this.data = data;
		this.next = next;
	}
	
	public MyPQ getData() {
		return data;
	}
}
