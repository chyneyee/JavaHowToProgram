package exercises;

import java.util.Scanner; // program uses class Scanner

/* 09/02/2015
 * Exercise 2.12
 * Write an application that asks the user to enter two integers, obtains them from the user
 * and displays the larger number followed by the words "is larger". If the numbers are equal,
 * print the message "These numbers are equal". Use the techniques shown in Fig. 2.15.
 */
public class Exercise0212 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// initialize variables
		int num1;	// first integer for input
		int num2;	// second integer for input
		
		System.out.print("Enter first integer: ");	// prompt
		num1 = input.nextInt();	// read first integer from user
		
		System.out.print("Enter second integer: ");	// prompt
		num2 = input.nextInt();	// read second integer from user
		
		if (num1 > num2)
			System.out.printf("%d is larger than %d\n",num1,num2);
		
		if (num1 < num2)
			System.out.printf("%d is larger than %d\n", num2, num1);
		
		if (num1 == num2)
			System.out.println("These numbers are equal");

	}	// end method main

}	// end class Exercise0212



/* Output:
 * Enter first integer: 10
 * Enter second integer: 4
 * 10 is larger than 4
 * 
 * Enter first integer: 0
 * Enter second integer: 9
 * 9 is larger than 0
 * 
 * Enter first integer: 13
 * Enter second integer: 13
 * These numbers are equal
 * 
 */
