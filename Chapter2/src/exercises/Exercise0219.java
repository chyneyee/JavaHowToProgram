package exercises;

import java.util.Scanner;	// program uses class Scanner

/* 10/02/2015
 * Exercise 2.19
 * Write an application that reads five integers, determines and prints the largest and smallest
 * integers in the group. Use only the programming techniques you learned in this chapter.
 */
public class Exercise0219 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input=new Scanner(System.in);
		
		// initialize variables
		int num1;	// first integer for user input
		int num2;	// second integer for user input
		int num3;	// third integer for user input
		int num4;	// fourth integer for user input
		int num5;	// fifth integer for user input
		int smallest;	// store smallest integer
		int largest;	// store largest integer
		
		System.out.print("Enter first integer: ");	// prompt
		num1 = input.nextInt(); // read first integer from user
		
		System.out.print("Enter second integer: ");	// prompt
		num2 = input.nextInt();	// read second integer from user
		
		System.out.print("Enter third integer: ");	// prompt
		num3 = input.nextInt();	// read third integer from user
		
		System.out.print("Enter fourth integer: ");	// prompt
		num4 = input.nextInt(); // read fourth integer from user
		
		System.out.print("Enter fifth integer: ");	// prompt
		num5 = input.nextInt();	// read fifth integer from user
		
		smallest = num1;		// set first integer as the smallest for comparison
		if (num2 < smallest)
			smallest = num2;
		
		if (num3 < smallest)
			smallest = num3;
		
		if (num4 < smallest)
			smallest = num4;
		
		if (num5 < smallest)
			smallest = num5;
		
		largest = num1;	// set the first integer as the largest for comparison
		if (num2 > largest)
			largest = num2;
		
		if (num3 > largest)
			largest = num3;
		
		if (num4 > largest)
			largest = num4;
		
		if (num5 > largest)
			largest = num5;
		
		System.out.printf("Smallest integer is: %d\n", smallest);	// display the smallest integer
		System.out.printf("Largest integer is %d\n", largest);	// display the largest integer
		
	}	// end method main

}	// end class Exercise0219



/* Output:
 *  
 ***** First input largest *****
 * Enter first integer: 5
 * Enter second integer: 4
 * Enter third integer: 3
 * Enter fourth integer: 2
 * Enter fifth integer: 1
 * Smallest integer is: 1
 * Largest integer is 5
 * 
 ***** Second input largest *****
 * Enter first integer: 0
 * Enter second integer: 15
 * Enter third integer: 7
 * Enter fourth integer: 6
 * Enter fifth integer: 10
 * Smallest integer is: 0
 * Largest integer is 15
 * 
 ***** Third input largest *****
 * Enter first integer: 1
 * Enter second integer: 10
 * Enter third integer: 15
 * Enter fourth integer: 9
 * Enter fifth integer: 7
 * Smallest integer is: 1
 * Largest integer is 15
 * 
 ***** Fourth input largest *****
 * Enter first integer: 5
 * Enter second integer: 12
 * Enter third integer: 7
 * Enter fourth integer: 18
 * Enter fifth integer: 9
 * Smallest integer is: 5
 * Largest integer is 18
 * 
 ***** Fifth input largest *****
 * Enter first integer: 0
 * Enter second integer: 9
 * Enter third integer: 17
 * Enter fourth integer: 1
 * Enter fifth integer: 50
 * Smallest integer is: 0
 * Largest integer is 50
 * 
 ***** First input smallest *****
 * Enter first integer: -4
 * Enter second integer: 6
 * Enter third integer: 19
 * Enter fourth integer: 2
 * Enter fifth integer: 5
 * Smallest integer is: -4
 * Largest integer is 19
 * 
 ***** Second input smallest *****
 * Enter first integer: 10
 * Enter second integer: -5
 * Enter third integer: 9
 * Enter fourth integer: 11
 * Enter fifth integer: 4
 * Smallest integer is: -5
 * Largest integer is 11
 * 
 ***** Third input smallest *****
 * Enter first integer: 0
 * Enter second integer: 20
 * Enter third integer: -9
 * Enter fourth integer: 4
 * Enter fifth integer: 19
 * Smallest integer is: -9
 * Largest integer is 20
 * 
 ***** Fourth input smallest *****
 * Enter first integer: 10
 * Enter second integer: 24
 * Enter third integer: 7
 * Enter fourth integer: 0
 * Enter fifth integer: 10
 * Smallest integer is: 0
 * Largest integer is 24
 * 
 ***** Fifth input smallest *****
 * Enter first integer: 20
 * Enter second integer: 15
 * Enter third integer: 11
 * Enter fourth integer: 34
 * Enter fifth integer: 1
 * Smallest integer is: 1
 * Largest integer is 34
 * 
 */
