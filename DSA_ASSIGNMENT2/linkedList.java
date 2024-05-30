package DSA_ASSIGNMENT2;

class LinkedList {
     Node head; // Head of the linked list

     // initialize an empty linkedList
     public LinkedList() {
         this.head = null;
     }
     
     // Method used to search a specific value in the node
     
     public void search(int value) {
         Node current = head;
         boolean found = false;
         while (current != null) {
             if (current.data == value) {
                 System.out.println("It Exists!");
                 found = true;
                 break;
             }
             current = current.next;
         }
         if (!found) {
             System.out.println("It Does Not Exist!");
         }
     }

     // Method used to insert a node(Data) at a specific position(index + 1)
    
     public void insertAtPos(int data, int position) {
         
         // create newNode object
         Node newNode = new Node(data);
         
         // entry at position one is the head node
         if (position == 1) {
             newNode.next = head;
             head = newNode;
         } 
         
         else {
             Node current = head;
             int i = 1;
             while (i < position - 1 && current != null) {
                 current = current.next;
                 i++;
             }
             if (current == null) {
                 System.out.println("Can not enter at this position!");
             } else {
                 newNode.next = current.next;
                 current.next = newNode;
             }
         }
     }
     
     // Method that deleted node at a specific position
     
     public void deleteAtPosition(int position) {
         
         // if head is null then list is empty so deleting is not possible
         if (position == 1) {
             if (head == null) {
                 System.out.println("List is Empty!");
             } else {
                 head = head.next;
             }
         } 
         
         else {
             Node current = head;
             Node prev = null;
             int count = 1;
             while (current != null && count < position) {
                 prev = current;
                 current = current.next;
                 count++;
             }
             if (current == null) {
                 System.out.println("Can not delete at this position");
             } else {
                 prev.next = current.next;
             }
         }
     }

     // Method to delete the node that occurs after a given node in the linked list.
      
     public void deleteAfterNode(Node prevNode) {
         if (prevNode == null || prevNode.next == null) {
             System.out.println("No node to delete.");
         } else {
             prevNode.next = prevNode.next.next;
         }
     }
     
     // Method that is used to print the elements of the LinkedList
     public void print(LinkedList list) {
         Node current = list.head;
         while (current != null) {
             System.out.print(current.data + " ");
             current = current.next;
         }
         System.out.println();
     }
}
