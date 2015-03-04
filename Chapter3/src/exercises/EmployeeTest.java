package exercises;

/**
 * @author mychin
 * @date Mar 4, 2015
 * @time 2:15:08 PM
 */

public class EmployeeTest 
{
	// main method begins program execution
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee( "John", "Smith", 5000.00 );
		Employee emp2 = new Employee( "Jane", "Doe", 8000.00 );
		
		// display employee's initial yearly salary
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getYearlySalary() );
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getYearlySalary() );
		
		System.out.println();
		
		// display employee's salary after giving 10% raise
		System.out.println( "***** Giving 10% raise for each employee *****" );
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp1.getFirstName(), emp1.getLastName(), emp1.getRaiseSalary() );
		System.out.printf( "Yearly salary of %s %s: %.2f\n", emp2.getFirstName(), emp2.getLastName(), emp2.getRaiseSalary() );
	} // end method main
} // end EmployeeTest



/* Output:
 * Yearly salary of John Smith: 60000.00
 * Yearly salary of Jane Doe: 96000.00
 * 
 * ***** Giving 10% raise for each employee *****
 * Yearly salary of John Smith: 66000.00
 * Yearly salary of Jane Doe: 105600.00
 * 
 */ 
