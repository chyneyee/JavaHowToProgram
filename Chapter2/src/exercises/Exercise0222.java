package exercises;

import java.util.Scanner;	// program uses class Scanner

/**
 * @author mychin
 * @date Feb 10, 2015
 * @time 12:40:00 PM
 * Exercise 2.22
 * Write an application that inputs from the user the radius of a circle as an integer and
 * prints the circle's diameter, circumference and area using the floating-point value 3.14159 for π.
 * Use the techniques shown in Fig. 2.7.
 * [Note: You may also use the predefined constant Math.PI for the value of π.
 * This constant is more precise than the value 3.14159. Class Math is defined in package java.lang.
 * Classes in that package are imported automatically, so you do not need to import class Math to use it.]
 * Use the following formulas (r is the radius):
 * diameter = 2r
 * circumference = 2πr
 * area = πr²
 * 
 * Do not store the results of each calculation in a variable. Rather, specify each calculation as the
 * value that will be output in a System.out.printf statement. Note that the values produced by the
 * circumference and area calculations are floating-point numbers. Such values can be output with the
 * format specifier %f in a System.out.printf statement.
 */
public class Exercise0222 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// create Scanner to obtain input from command window
		Scanner input = new Scanner(System.in);
		
		int r;	// user input for circle's radius
		
		System.out.print("Enter the radius of the circle: ");	// prompt
		r = input.nextInt();	// read radius input
		
		System.out.printf("Diameter of the circle is %d\n", (2 * r));	// calculates the diameter
		System.out.printf("Circumference of the circle is %.2f\n", (2* (Math.PI) * r));	// calculates the circumference
		System.out.printf("Area of the circle is %.2f\n", ((Math.PI) * (r * r)));	// calculates the area

	} // end method main

} // end class Exercise0222



/* Output:
 * Enter the radius of the circle: 6
 * Diameter of the circle is 12
 * Circumference of the circle is 37.70
 * Area of the circle is 113.10
 */
