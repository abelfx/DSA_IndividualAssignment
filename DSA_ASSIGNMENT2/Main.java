package DSA_ASSIGNMENT2;

public class Main {
	 public static void main(String[] args) {
	     
		 // Implementation and testing
		 
	     LinkedList list = new LinkedList();
	     
	     // inserting values to the LinkedList at specific positions
	     list.insertAtPos(3, 1);
	     list.insertAtPos(2, 2);
	     list.insertAtPos(1, 3);
	     

	     System.out.print("List: ");
	     list.print(list);
	     
	     // deleting a Node at position 2
	     list.deleteAtPosition(2); 
	     
         // printing the updated LinkedList
	     System.out.print("\nUpdated LinkedList: ");
	     list.print(list);
	     
	     // Testing of the search method
	     System.out.print("\nSearching for value 1: " ); 
	     list.search(1);
	     
	     System.out.print("Searching for value 10: "); 
	     list.search(10);
	     
	 }

	

}
