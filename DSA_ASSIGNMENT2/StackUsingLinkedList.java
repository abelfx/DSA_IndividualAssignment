package DSA_ASSIGNMENT2;

//Stack class implementing a stack data structure using linked lists
class Stack {
 private Node top; // Top of the stack

 // Constructor to initialize an empty stack
 public Stack() {
     this.top = null;
 }

 // Method to check if the stack is empty
 public boolean isEmpty() {
     return top == null;
 }

 // Method to push an element onto the stack
 public void push(int data) {
	 
	 // creating newNode object
     Node newNode = new Node(data);
     
     /* if its empty update the top node by the newNode
      * else newNode.next is now the top value
      */
     
     if (isEmpty()) {
         top = newNode;
     } else {
         newNode.next = top;
         top = newNode;
     }
 }

 // Method to pop an element from the stack
 public int pop() {
     if (isEmpty()) {
         System.out.println("Stack is empty. Cannot pop.");
         return -1; // Return a default value indicating stack underflow
     } else {
         int data = top.data;
         top = top.next;
         return data;
     }
 }

 // Method to peek the top element of the stack
 public int peek() {
	 
	 /* if list is empty return -1 
	  * else return the value of the topNode
	  */
     if (isEmpty()) {
         System.out.println("Stack is empty. Cannot peek.");
         return -1; 
     } else {
         return top.data;
     }
 }
 
}

//Main class to test the Stack implementation
public class StackUsingLinkedList {
	
	 //helper method to calculate number of elements
	 public static void counter(Stack stack) {
		  int counter = 0;
		     while(!stack.isEmpty()) {
		    	 stack.pop();
		    	 counter++;
		     }
		     System.out.println(counter);
	 }
	 
 public static void main(String[] args) {
	 
     // some stack operation using linkedList
     Stack stack = new Stack();
     stack.push(1);
     stack.push(2);
     stack.push(3);
     stack.push(4);
     
     System.out.println("top value: " + stack.peek());  

     System.out.println("First removed element: " + stack.pop());     

     System.out.println("Removed element: " + stack.pop());    
     
     System.out.println("Final top value: " + stack.peek());
     
     System.out.print("Element left: ");
     counter(stack);
     
  }
 
}



