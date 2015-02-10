package exercises;

import java.util.Scanner;	// program uses class Scanner

/* 10/02/2015
 * Exercise 2.20
 * Write an application that reads an integer and determines and prints whether it is odd or
 * even. [Hint: Use the remainder operator. An even number is a multiple of 2. Any multiple of 2
 * leaves a remainder of 0 when divided by 2.]
 */
public class Exercise0220 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// initialize variables
		int num;	// an integer for user input
		
		System.out.print("Enter an integer: ");	// prompt
		num = input.nextInt();	// read an integer from user
		
		// if remainder is 0 after divide by 2, the number is an even number
		if (num % 2 == 0)
			System.out.printf("%d is an even number", num);	// display the integer as even number
		
		// if remainder is not zero after divide by 2, the number is an odd number
		if (num % 2 != 0)
			System.out.printf("%d is an odd number", num);	// display the integer as odd number
	
	}	// end method main

}	// end class Exercise0220



/* Output:
 * Enter an integer: 115
 * 115 is an odd number
 * 
 * Enter an integer: 500
 * 500 is an even number
 */
