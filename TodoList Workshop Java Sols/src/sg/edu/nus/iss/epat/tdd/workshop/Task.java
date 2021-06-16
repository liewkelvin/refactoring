package sg.edu.nus.iss.epat.tdd.workshop;

import java.util.Date;

public class Task {
   private String description;

   private String categoryCode;
   private Date completionDate;
   // H-High M-Medium L-Low
   private char priority;
   private boolean isComplete;

   
   public String getCategoryCode() {
	return categoryCode;
}

   public void setCategoryCode(String categoryCode) {
	   this.categoryCode = categoryCode;
   }

   public Date getCompletionDate() {
	   return completionDate;
   }

   public void setCompletionDate(Date completionDate) {
	   this.completionDate = completionDate;
   }

   public char getPriority() {
	   return priority;
   }

   public void setPriority(char priorty) {
	   this.priority = priorty;
   }

   public Task(String description) {
      this(description, false);
   }

   public Task(String description, boolean isComplete) {
      this.description = description;
      this.isComplete = isComplete;
      this.categoryCode = null;
	  this.completionDate = null;
	  this.priority = ' ';
   }
   
   
   // new method to create Task Object with new properties
   public Task(String description, String categoryCode, Date completionDate, char priorty, boolean isComplete) {
	   this.description = description;
	   this.categoryCode = categoryCode;
	   this.completionDate = completionDate;
	   this.priority = priorty;
	   this.isComplete = isComplete;
   }

   public String getDescription() {
      return description;
   }

   public void setDescription(String description) {
      this.description = description;
   }

   public boolean isComplete() {
      return isComplete;
   }

   public void setComplete(boolean isComplete) {
      this.isComplete = isComplete;
   }

}
