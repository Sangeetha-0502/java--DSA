package practice;

public class LinkedList {
	Node head;

	class Node {
		int data;
		Node next;

		Node(int val) {
			data = val;
			next = null;
		}
	}

	LinkedList() {
		head = null;
	}

	public void insert(int val) {
		Node newnode = new Node(val);
		if (head == null) {
			head = newnode;
		} else {
			newnode.next = head;
			head = newnode;

		}

	}

	public void createLoop() {
		if (head == null)
			return;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = head; // Creating a loop by pointing the last node to the head
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.println();
	}

	public void insertAtpos(int pos, int val) {
		if (pos == 0) {
			insert(val);
			return;
		}
		Node newnode = new Node(val);
		Node temp = head;
		for (int i = 1; i < pos; i++) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;

	}

	public void delete(int pos) {
		Node temp = head;
		Node prev = null;
		for (int i = 1; i <= pos; i++) {
			prev = temp;
			temp = temp.next;

		}
		prev.next = temp.next.next;
	}

	public void reverse() {
		Node prev = null;
		Node current = head;
		Node next = head.next;
		while (current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;

		}
		head = prev;
	}

	public boolean detect() {

		Node slow = head;
		Node fast = head;
		while (slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if (slow == fast) {
				return true;
			}

		}
		return false;
	}

}
