package sait.sll.utility;

public class SLL implements LinkedListADT {

	private Node head;
	private Node tail;

	private int size;

	public SLL() {
		head = tail = null;
		size = 0;
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	@Override
	public int size() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isEmpty() {
		return (head == null);
	}

	public void addToHead(Object o) {
		head = new Node(o, head);
		if (tail == null) {
			tail = head;
		}
		size++;
	}

	public void append(Object o) {
		if (!isEmpty()) {
			tail.setNextNode(new Node(o));
			tail = tail.getNextNode();
		} else {
			head = tail = new Node(o);
		}

		size++;
	}

	public void print() {
		for (Node tempNode = head; tempNode != null; tempNode = tempNode.getNextNode()) {
			System.out.println(tempNode.getElement().toString());
		}
	}

	@Override
	public void clear() {
		head = tail = null;
		size = 0;
	}

	@Override
	public void prepend(Object data) {
		// TODO Auto-generated method stub

	}

	@Override
	public void insert(Object data, int index) throws IndexOutOfBoundsException {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			int i = 0;
			Node newNode = new Node(data);
			Node currentIndexedNode;
			Node previousIndexedNode;
			Node 
			
		}

	}

	@Override
	public void replace(Object data, int index) throws IndexOutOfBoundsException {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else {
			int i = 0;
			Node node;
			
			for (node = head; i < index; i++, node = node.getNextNode());
			
			node.setElement(data);
		}

	}

	@Override
	public void delete(int index) throws IndexOutOfBoundsException {
		if (isEmpty()) {
			System.out.println("List is empty");
		} else if (index == 0) {
			head = head.getNextNode();
			size--;
		} else {
			int i = 0;
			Node previousNode;

			for (previousNode = head; i < index - 1; i++, previousNode = previousNode.getNextNode());
			
			previousNode.setNextNode(previousNode.getNextNode().getNextNode());
			size--;
		}
	}

	@Override
	public Object retrieve(int index) throws IndexOutOfBoundsException {
		if (isEmpty()) {
			return null;
		} else {
			int currentIndex = 0;

			for (Node node = head; currentIndex <= index; currentIndex++, node = node.getNextNode()) {
				if (currentIndex == index) {
					return node.getElement();
				}
			}
		}

		return null;
	}

	@Override
	public int indexOf(Object data) {
		if (isEmpty()) {
			return 0;
		} else {
			int index = 0;
			for (Node tempNode = head; tempNode != null; index++, tempNode = tempNode.getNextNode()) {
				if (data.equals(tempNode.getElement())) {
					return index;
				}
			}
		}

		return 0;
	}

	@Override
	public boolean contains(Object data) {
		if (isEmpty()) {
			return false;
		} else {
			for (Node tempNode = head; tempNode != null; tempNode = tempNode.getNextNode()) {
				if (data.equals(tempNode.getElement())) {
					return true;
				}
			}
		}

		return false;
	}
}
