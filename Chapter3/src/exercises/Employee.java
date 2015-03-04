package exercises;

/**
 * @author mychin
 * @date Mar 4, 2015
 * @time 1:48:13 PM
 * 
 * Exercise 3.10
 * Create a class called Employee that includes three pieces of information as instance variables
 * - a first name (type String), a last name (type String) and a monthly salary (double).
 * Your class should have a constructor that initializes the three instance variables.
 * Provide a set and a get method for each instance variable.
 * If the monthly salary is not positive, set it to 0.0.
 * Write a test application named EmployeeTest that demonstrates class Employee's capabilities.
 * Create two Employee objects and display each object's yearly salary.
 * Then give each Employee a 10% raise and display each Employee's yearly salary again.
 */
public class Employee 
{
	private String firstName; // instance variable that stores the first name
	private String lastName; // instance variable that stores the last name
	private double monthlySalary; // instance variable
	
	// constructor initializes firstName, lastName and monthlySalary with String and double supplied as argument
	public Employee (String fname, String lname, double msalary)
	{
		firstName = fname; // initialize firstName
		lastName = lname; // initialize lastName
		monthlySalary = msalary; // initialize monthlySalary
		
		// if the monthly salary is not positive, set it to 0.0.
		if (msalary < 0.0)
			monthlySalary = 0.0;
	} // end constructor
	
	// method to set the first name
	public void setFirstName (String fname)
	{
		firstName = fname;	// store the first name
		
	} // end method setFirstName
	
	// method to retrieve first name
	public String getFirstName ()
	{
		return firstName;
	} // end method getFirstName
	
	// method to set the last name
	public void setLastName (String lname)
	{
		lastName = lname;	// store the last name
	} // end method setLastName
	
	// method to retrieve last name
	public String getLastName ()
	{
		return lastName;
	} // end method getLastName
	
	// method to set the monthly salary
	public void setMonthlySalary (double msalary)
	{
		monthlySalary = msalary;	// store the monthly salary
		

	} // end method setMonthlySalary
	
	// method to retrieve monthly salary
	public double getMonthlySalary ()
	{
		return monthlySalary;
	} // end method getMonthlySalary
	
	// method to retrieve yearly salary
	public double getYearlySalary()
	{
		double yearlySalary = monthlySalary * 12;
		return yearlySalary;
	} // end method getYearlySalary
	
	// method to retrieve yearly salary after giving 10% raise
	public double getRaiseSalary()
	{
		double raise =  monthlySalary * 0.1 ;
		double raiseSalary = ( monthlySalary + raise ) * 12;
		return raiseSalary;
	} // end method getRaiseSalary
	
} // end class Employee
