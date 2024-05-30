package DSA_ASSIGNMENT1;

public class Task {
	
	// Declaring of variables used in our to_do_list
	private boolean completed;
	private String title;
	private String description;
	
	// Class constructor to initiate variables
	Task(String title, String description){
		
		// initializing of the variable using this keyword
		this.title = title;
		this.description = description;
		this.completed = false;
	}
	
	// getters to return the values of the variables
	public String getDescription() {
		return description;
	}
	
	public String getTitle() {
		return title;
	}
	
	// void method to mark the task completed
		public void markCompleted() {
			completed = true;
		}
	
	// boolean method to check whether task is completed or not
	public boolean isCompleted() {
		return completed;
	}
	
	

}
