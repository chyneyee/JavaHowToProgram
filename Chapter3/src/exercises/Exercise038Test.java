package exercises;

/**
 * @author mychin
 * @date Mar 3, 2015
 * @time 2:46:46 PM
 * 
 * Exercise 3.8
 */
public class Exercise038Test 
{
	// main method begins program execution
	public static void main(String[] args) 
	{
		// create Exercise038 object
		Exercise038 gradeBook = new Exercise038("Introduction to Java Programming","James Gosling"); 
		
		// display welcome message with the course and instructor name
		gradeBook.displayMessage();
		
	} // end main
	
} // end class Exercise038Test



/* Output:
 * Welcome to the grade book for
 * Introduction to Java Programming!
 * This course is presented by: James Gosling
 */