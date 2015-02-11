package exercises;

import java.util.Scanner;	// program uses class Scanner

/**
 * @author mychin
 * @date Feb 11, 2015
 * @time 5:46:53 PM
 * Exercise 2.23
 * Write an application that inputs one number consisting of five digits from the user, separates
 * the number into its individual digits and prints the digits separated from one another by three
 * spaces each.
 * For example, if the user types in the number 42339, the program should print
 * 4   2   3   3   9
 * 
 * Assume that the user enters the correct number of digits. What happens when you execute the program
 * and type a number with more than five digits? What happens when you execute the program and type
 * a number with fewer than five digits? [Hint: It is possible to do this exercise with the techniques
 * you learned in this chapter. You will need to use both division and remainder operations to
 * "pick off" each digit.]
 */
public class Exercise0223 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		// initialize variables
		int num;	// user input
		
		System.out.print("Enter a number with five digits: ");	// prompt
		num = input.nextInt();	// read five digits input
		
		// ensure input number with five digits
		if ( (num >= 10000) && (num <= 99999) )
		{
		System.out.printf("%d   ", (num / 10000));
		System.out.printf("%d   ", (num / 1000) % 10);
		System.out.printf("%d   ", (num / 100) % 10);
		System.out.printf("%d   ", (num % 100) / 10);
		System.out.printf("%d   ", (num % 10));
		}
		
		// if entered number more than five digits
		if (num > 99999)
			System.out.println("You had entered a number more than five digits.");
		
		// if entered number less than five digits
		if (num <= 9999)
			System.out.println("You had entered a number less than five digits.");


	} // end method main

} // end class Exercise0223
