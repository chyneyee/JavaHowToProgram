package exercises;

/* Exercise 2.10
 * Write an application that displays the number 1 to 4 on the same line, with each pair of
 * adjacent numbers separated by one space. Write the program using the following techniques:
 * (a) Use one System.out.println statement.
 * (b) Use four System.out.print statements.
 * (c) Use one System.out.printf statement.
 */
public class Exercise0210 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// Initialize variable
		int num1 = 1;	// first number set to 1
		int num2 = 2;	// second number set to 2
		int num3 = 3;	// third number set to 3
		int num4 = 4;	// fourth number set to 4
		
		// (a) Use one System.out.println statement.
		System.out.println("Part (a)");
		System.out.println(num1+" "+num2+" "+num3+" "+num4);
		
		System.out.println();
		
		// (b) Use four System.out.print statements.
		System.out.println("Part (b)");
		System.out.print(num1+" ");
		System.out.print(num2+" ");
		System.out.print(num3+" ");
		System.out.print(num4);
		
		System.out.println("\n");
		
		// (c) Use one System.out.printf statement.
		System.out.println("Part (c)");
		System.out.printf("%d %d %d %d", num1,num2,num3,num4);
		
	}	// end method main
	
}	// end class Exercise0210



/* Output:
Part (a)
1 2 3 4

Part (b)
1 2 3 4

Part (c)
1 2 3 4
 */ 
