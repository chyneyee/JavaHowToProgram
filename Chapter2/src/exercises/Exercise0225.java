package exercises;

import java.util.Scanner;	// program uses class Scanner

/**
 * @author mychin
 * @date Feb 12, 2015
 * @time 12:48:36 PM
 * Exercise 2.25
 * Write a program that inputs five numbers and determines and prints the number of negative numbers
 * input, the number of positive numbers input and the numbers of zeros input.
 */
public class Exercise0225 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		int num1;	// first integer user input
		int num2;	// second integer user input
		int num3;	// third integer user input
		int num4;	// fourth integer user input
		int num5;	// fifth integer user input
		int totalNeg=0;	// counts the total negative numbers input
		int totalPos=0;	// counts the total positive numbers input
		int totalZero=0;	// counts the total numbers of zero input
		
		System.out.print("Enter first integer: ");	// prompt
		num1 = input.nextInt();	// read first integer
		
		System.out.print("Enter second integer: ");	// prompt
		num2 = input.nextInt();	// read second integer
		
		System.out.print("Enter third integer: ");	// prompt
		num3 = input.nextInt();	// read third integer
		
		System.out.print("Enter fourth integer: ");	// prompt
		num4 = input.nextInt();	// read fourth integer
		
		System.out.print("Enter fifth integer: ");	// prompt
		num5 = input.nextInt();	// read fifth integer
		
		// if any integer input is a negative number, add 1
		if (num1 < 0)
			totalNeg = totalNeg + 1;	
		
		if (num2 < 0)
			totalNeg = totalNeg + 1;
		
		if (num3 < 0)
			totalNeg = totalNeg + 1;
	
		if (num4 < 0)
			totalNeg = totalNeg + 1;
		
		if (num5 < 0)
			totalNeg = totalNeg + 1;
		
		// if any integer input is a positive number, add 1
		if (num1 > 0)
			totalPos = totalPos + 1;
		
		if (num2 > 0)
			totalPos = totalPos + 1;
		
		if (num3 > 0)
			totalPos = totalPos + 1;
		
		if (num4 > 0)
			totalPos = totalPos + 1;
		
		if (num5 > 0)
			totalPos = totalPos + 1;
		
		// if any integer input is zero, add 1
		if (num1 == 0)
			totalZero = totalZero + 1;
		
		if (num2 == 0)
			totalZero = totalZero + 1;
		
		if (num3 == 0)
			totalZero = totalZero + 1;
		
		if (num4 == 0)
			totalZero = totalZero + 1;
		
		if (num5 == 0)
			totalZero = totalZero + 1;
		
		System.out.println();
		System.out.printf("Total negative numbers: %d\n", totalNeg);	// display total input of negative numbers
		System.out.printf("Total postive numbers: %d\n", totalPos);	// display total input of positive numbers
		System.out.printf("Total zero numbers: %d\n", totalZero);	// display total input of zero numbers

	} // end method main

} // end class Exercise0225



/* Output:
 * Enter first integer: -1
 * Enter second integer: -2
 * Enter third integer: -3
 * Enter fourth integer: -4
 * Enter fifth integer: -5
 * 
 * Total negative numbers: 5
 * Total postive numbers: 0
 * Total zero numbers: 0
 * 
 **********
 *
 * Enter first integer: 0
 * Enter second integer: -5
 * Enter third integer: 7
 * Enter fourth integer: -1
 * 
 * Enter fifth integer: 26
 * Total negative numbers: 2
 * Total postive numbers: 2
 * Total zero numbers: 1
 * 
 */ 
