package exercises;

/**
 * @author mychin
 * @date Mar 3, 2015
 * @time 2:16:06 PM
 * Exercise 3.8
 * Modify class GradeBook (Fig. 3.10) as follows:
 * a) Include a second String instance variable that represents the name of the course's instructor.
 * b) Provide a set method to change the instructor's name and a get method to retrieve it.
 * c) Modify the constructor to specify two parameters - one for the course name and one for the instructor's name.
 * d) Modify method displayMessage such that it first outputs the welcome message and course name,
 * then outputs "This course is presented by: " followed by the instructor's name.
 * 
 * Use your modified class in a test application that demonstrates the class's new capabilities.
 */
public class Exercise038 
{
	private String courseName;	// course name for this GradeBook
	private String instructorName;	// course's instructor for this GradeBook
	
	// constructor initializes courseName and instructorName with String supplied as argument
	public Exercise038( String cname, String iname )
	{
		courseName = cname;	// initializes courseName
		instructorName = iname;	// initializes instructorName
	} // end constructor
	
	// method to set the course name
	public void setCourseName( String cname )
	{
		courseName = cname;	// store the course name
	} // end method setCourseName
	
	// method to retrieve the course name
	public String getCourseName( )
	{
		return courseName;
	} // end method getCourseName
	
	// method to set the instructor name
	public void setInstructorName( String iname )
	{
		instructorName = iname;	// store the instructor name
	} // end method setInstructorName
	
	// method to retrieve the instructor name
	public String getInstructorName()
	{
		return instructorName;
	} // end method getInstructorName
	
	// display a welcome message to the GradeBook user
	public void displayMessage()
	{
		// this statement calls getCourseName to get the
		// name of the course this GradeBook represents
		System.out.printf( "Welcome to the grade book for\n%s!\n", getCourseName() );
		System.out.printf( "This course is presented by: %s\n", getInstructorName() );
	} // end method displayMessage
	
} // end class Exercise038



/* Output:
 * Welcome to the grade book for
 * Introduction to Java Programming!
 * This course is presented by: James Gosling
 */
