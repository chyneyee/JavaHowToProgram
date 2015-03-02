package figures;

import java.util.Scanner; // program uses Scanner

/**
 * @author mychin
 * @date Mar 2, 2015
 * @time 6:03:19 PM
 * 
 * Fig. 3.5: GradeBookTest.java
 * Create GradeBook object and pass a String to its displayMessage method.
 */
public class GradeBook2Test
{
	// main method begins program execution
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner( System.in );
		
		// create a GradeBook object and assign it to myGradeBook
		GradeBook2 myGradeBook2 = new GradeBook2();
		
		// prompt for and input course name
		System.out.println( "Please enter the course name:" );
		String nameOfCourse = input.nextLine();	// read a line of text
		System.out.println(); // outputs a blank line
		
		// call myGradeBook2's displayMessage method
		// and pass nameOfCourse as an argument
		myGradeBook2.displayMessage( nameOfCourse );
	} // end main

} // end class GradeBookTest



/* Output:
 * 
Please enter the course name:
CS101 Introduction to Java Programming

Welcome to the grade book for
CS101 Introduction to Java Programming!
 *
 */
