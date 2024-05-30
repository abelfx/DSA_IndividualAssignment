package DSA_ASSIGNMENT1;

public class Main {
    public static void main(String[] args) {
        // Testing the implementation
        ToDoList toDoList = new ToDoList();
        
        // viewing the to do list without adding anything
        toDoList.viewToDoList();
        
        System.out.println();

        // Adding tasks
        toDoList.addToDo(new Task("Read", "From 11 to 1"));
        toDoList.addToDo(new Task("Excersie", "from 12 - 13"));
        toDoList.addToDo(new Task("Play games", "After Dinner"));

        // Marking a task as completed
        toDoList.markToDoAsCompleted("Read");

        // Viewing the to-do list
        toDoList.viewToDoList();
    }
}
