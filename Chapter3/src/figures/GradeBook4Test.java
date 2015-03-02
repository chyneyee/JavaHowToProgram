package figures;

/**
 * @author mychin
 * @date Mar 2, 2015
 * @time 6:51:15 PM
 * 
 * Fig. 3.11: GradeBookTest.java
 * GradeBook constructor used to specify the course name at the
 * time each GradeBook object is created.
 */
public class GradeBook4Test 
{
	// main method begins program execution
	public static void main(String[] args) 
	{
		// create GradeBook object
		GradeBook4 gradeBook1 = new GradeBook4( "CS101 Introduction to Java Programming" );
		GradeBook4 gradeBook2 = new GradeBook4( "CS102 Data Structures in Java" );
		
		// display initial value of courseName for each GradeBook
		System.out.printf( "gradeBook1 course name is: %s\n", gradeBook1.getCourseName() );
		System.out.printf( "gradeBook2 course name is: %s\n", gradeBook2.getCourseName() );
	} // end main

} // end class GradeBookTest



/* Output:
 * gradeBook1 course name is: CS101 Introduction to Java Programming
 * gradeBook2 course name is: CS102 Data Structures in Java
 */ 
