package DSA_ASSIGNMENT1;

public class Node {
	
	/* Defining a node with an object Task 
	 * for a linked list implementation
	*/
	
	// used the task class here
	Task Task;
	Node next;
	
	public Node(Task Task) {
		this.Task = Task;
		this.next = null;
	}
}
