package practice;

public class LinkedList_Driver {

	public static void main(String[] args) {
		LinkedList li = new LinkedList();
		li.insert(1);
		li.insert(2);
		li.insert(3);
		li.insert(4);
		li.insert(6);
		li.createLoop();
		li.reverse();
		li.display();
	}

}
