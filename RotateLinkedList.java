package practice;

public class RotateLinkedList {
	Node head;
	Node tail;

	class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}

	}

	public RotateLinkedList() {
		head = null;
		tail = null;
	}

	public void insert(int data) {
		Node newnode = new Node(data);
		newnode.next = head;
		head = newnode;
		if (head == null) {
			tail = newnode;
		}
	}

	public void insertlast(int data) {
		Node newnode = new Node(data);
		if (tail == null) {
			tail = newnode;
			head = newnode;
		} else {
			tail.next = newnode;
			tail = newnode;
		}
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
	}

	public void rotate(int k) {
		if (k == 0) {
			return;
		}
		Node current = head;
		int count = 1;
		while (count < k && current != null) {
			current = current.next;
			count++;
		}
		Node kthnode = current;
		while (current.next != null) {
			current = current.next;
		}
		current.next = head;
		head = kthnode.next;
		kthnode.next = null;

	}

	public static void main(String[] args) {
		RotateLinkedList rl = new RotateLinkedList();
		rl.insertlast(1);
		rl.insertlast(2);
		rl.insertlast(3);
		rl.insertlast(4);
		rl.insertlast(5);
		rl.display();
		rl.rotate(2);
		System.out.println();
		rl.display();
	}

}
