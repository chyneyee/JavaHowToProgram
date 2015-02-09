package exercises;

import java.util.Scanner; // program uses class Scanner

/* 09/09/2015
 * Exercise 2.11
 * Write an application that asks the user to enter two integers, obtains them from the user
 * and prints their sum, product, difference and quotient (division). Use the techniques shown in
 * Fig. 2.7.
 */
public class Exercise0211 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input=new Scanner(System.in);
		
		// Initialize variable
		int num1;	// first integer for user input
		int num2;	// second integer for user input
		int sum;	// sum of num1 and num2
		int product;	// product of num1 and num2
		int difference;	// difference of num1 and num2
		int quotient;	// quotient of num1 and num2
		
		System.out.print("Enter first integer: ");	// prompt
		num1 = input.nextInt();	// read first number from user
		
		System.out.print("Enter second integer: ");	// prompt
		num2 = input.nextInt();	// read second number from user
		
		sum	= num1 + num2;	// add numbers
		product	= num1 * num2;	// multiply numbers
		difference = num1 - num2;	// difference of numbers
		quotient = num1 / num2;	// division of numbers
		
		System.out.printf("Sum is %d\n", +sum);	// display sum
		System.out.printf("Product is %d\n", +product);	// display product
		System.out.printf("Difference is %d\n", +difference);	// display difference
		System.out.printf("Quotient is %d\n", +quotient);	// display quotient
		
	}	// end method main

}	// end class Exercise0211



/* Output:
 * Enter first integer: 5
 * Enter second integer: 10
 * Sum is 15
 * Product is 50
 * Difference is -5
 * Quotient is 0
 * 
 * Enter first integer: 6
 * Enter second integer: 4
 * Sum is 10
 * Product is 24
 * Difference is 2
 * Quotient is 1 
 */
