package figures;

import java.util.Scanner; // program uses Scanner

/**
 * @author mychin
 * @date Mar 2, 2015
 * @time 6:23:59 PM
 * 
 * Fig. 3.8: GradeBookTest.java
 * Create and manipulate a GradeBook object.
 */
public class GradeBook3Test 
{
	// main method begins program execution
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		// create a GradeBook object and assign it to myGradeBook
		GradeBook3 myGradeBook3 = new GradeBook3();
		
		// display initial value of courseName
		System.out.printf( "Initial course name is: %s\n\n", myGradeBook3.getCourseName() );
		
		// prompt for and read course name
		System.out.println( "Please enter the course name:" );
		String theName = input.nextLine();	// read a line of text
		myGradeBook3.setCourseName(theName); // set the course name
		System.out.println(); // outputs a blank line
		
		// display welcome message after specifying course name
		myGradeBook3.displayMessage();
	} // end main

} // end class GradeBookTest



/* Output:
 * 
 * 
 * Initial course name is: null
 * 
 * Please enter the course name:
 * CS101 Introduction to Java Programming
 * 
 * Welcome to the grade book for 
 * CS101 Introduction to Java Programming!
 * 
 */ 
