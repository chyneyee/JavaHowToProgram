package exercises;

import java.util.Scanner;	 // program uses class Scanner

/* 09/02/2015
 * Exercise 2.13
 * Write an application that inputs three integers from the user and displays the sum, average,
 * product, smallest and largest of the numbers. Use the techniques shown in Fig. 2.15.
 * [Note: The calculation of the average in this exercise should result in an integer representation
 * of the average.
 * So if the sum of the values is 7, the average should be 2, not 2.3333....]
 */
public class Exercise0213 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// initialize variables
		int num1;	// first integer for user input
		int num2;	// second integer for user input
		int num3;	// third integer for user input
		int sum;	// sum of num1, num2, and num3
		int average;	// average of num1, num2, and num3
		int product;	// product of num1, num2, and num3
		int smallest;	// smallest number from num1, num2, and num3
		int largest;	// largest number from num1, num2, and num3
		
		System.out.print("Enter first integer: ");	// prompt
		num1 = input.nextInt(); // read first integer from user
		
		System.out.print("Enter second integer: ");	// prompt
		num2 = input.nextInt();	// read second integer from user
		
		System.out.print("Enter third integer: ");	// prompt
		num3 = input.nextInt();	// read third integer from user
		
		sum = num1 + num2 + num3;	// add numbers
		average = (sum) / 3;	// average of the numbers
		product = num1 * num2 * num3;	// product of the numbers
		
		// Compare the numbers to find the smallest value
		smallest = num1;
		if (num2 <= smallest)
			smallest = num2;
		
		if (num3 <= smallest)
			smallest = num3;
		
		// Compare the numbers to find the largest value
		largest = num1;
		if (num2 >= largest)
			largest = num2;
		
		if (num3 >= largest)
			largest = num3;
		
		System.out.printf("Sum is %d\n", sum);	// display the sum
		System.out.printf("Average is %d\n", average);	// display the average
		System.out.printf("Product is %d\n", product);	// display the product
		System.out.printf("Smallest is %d\n", smallest);	// display the smallest number
		System.out.printf("Largest is %d\n", largest);	// display the largest number
		
	}	// end method main

}	// end class Exercise0213



/* Output:
 * 
 * Enter first integer: 10
 * Enter second integer: 9
 * Enter third integer: 8
 * Sum is 27
 * Average is 9
 * Product is 720
 * Smallest is 8
 * Largest is 10
 * 
 * Enter first integer: 1
 * Enter second integer: 2
 * Enter third integer: 3
 * Sum is 6
 * Average is 2
 * Product is 6
 * Smallest is 1
 * Largest is 3
 * 
 * Enter first integer: 6
 * Enter second integer: 20
 * Enter third integer: 11
 * Sum is 37
 * Average is 12
 * Product is 1320
 * Smallest is 6
 * Largest is 20
 * 
 */ 
