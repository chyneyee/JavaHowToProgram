package exercises;

import java.util.Scanner;	// program uses class Scanner

/**
 * @author mychin
 * @date Feb 10, 2015
 * @time 12:39:22 PM
 * Write an application that reads two integers, determines whether the first is a multiple of
 * the second and prints the result. [Hint: Use the remainder operator.]
 */
public class Exercise0221 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// initialize variables
		int num1;	// first integer for user input
		int num2;	// second integer for user input
		
		System.out.print("Enter first integer: ");	// prompt
		num1 = input.nextInt();	// read first integer input
		
		System.out.print("Enter second integer: ");	// prompt
		num2 = input.nextInt();	// read second integer input
		
		// if first is multiple of second, the remainder is 0
		if (num1 % num2 == 0)
			System.out.printf("%d is a multiple of %d", num1, num2);
		
		// if remainder is not 0, the first is not multiple of second
		if (num1 % num2 != 0)
			System.out.printf("%d is not the multiple of %d", num1, num2);

	} // end method main

}	// end class Exercise0221



/* Output:
 * Enter first integer: 15
 * Enter second integer: 3
 * 15 is a multiple of 3
 * 
 * Enter first integer: 30
 * Enter second integer: 4
 * 30 is not the multiple of 4
 */ 
