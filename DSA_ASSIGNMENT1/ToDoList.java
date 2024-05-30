package DSA_ASSIGNMENT1;

public class ToDoList {
	
	// Declare the head of the node
	private Node head;
	
	// method used Adding a Task to do in out list
	 public void addToDo(Task task) {
		 
		 // Create newNode_Class object with a certain task
	     Node newNode_Class = new Node(task);
	     
	     // if node head is null then assign a new node
	     if (head == null) {
	         head = newNode_Class;
	     } 
	     
	     // if not empty traverse until reaching the last node
	     else {
	         Node current = head;
	         while (current.next != null) {
	             current = current.next;
	         }
	         
	         // finally enter our node at the last place
	         current.next = newNode_Class;
	     }
	 }
	 
	 // a method that marks out to do list as completed
	 public void markToDoAsCompleted(String title) {
	     Node current = head;
	     
	     // traverse through the LinkedList until task title equals input title
	     while (current != null) {
	    	 
	    	 // as long as node take has different title from input task traversing continues
	         if (current.Task.getTitle().equals(title)) {
	             current.Task.markCompleted();
	             break;
	         }
	        // move to the next node
	         current = current.next;
	     }
	 }
	 
	 // Method that is used to view the To Do list
	 public void viewToDoList() {
		 
		 // if list is empty print the following.
	     if (head == null) {
	         System.out.println("List is Empty!");
	     } 
	     /* if list is not empty, print all all tasks of the list
	      * starting from the first
	      */
	     else {
	         Node current = head;
	         while (current != null) {
	             Task task = current.Task;
	             System.out.println("Title: " + task.getTitle() + 
	            		            "\nDescription: " + task.getDescription() +
	            		            "\nCompleted: " + (task.isCompleted() ? "Yes" : "No") +
	            		            "\n--------------------");
	             current = current.next;
	         }
	     }
	 }
	
}
