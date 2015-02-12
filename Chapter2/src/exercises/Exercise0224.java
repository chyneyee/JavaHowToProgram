package exercises;


/**
 * @author mychin
 * @date Feb 12, 2015
 * @time 12:29:46 PM
 * Exercise 2.24
 * Using only the programming techniques you learned in this chapter, write an application
 * that calculates the squares and cubes of the numbers from 0 to 10 and prints the resulting values in
 * table format, as show below. [Note: This program does not require any input from the user.]
 * number	square	cube
 * 0		0		0
 * 1		1		1
 * 2		4		8
 * 3		9		27
 * 4		16		64
 * 5		25		125
 * 6		36		216
 * 7		49		343
 * 8		64		512
 * 9		81		729
 * 10		100		1000
 */
public class Exercise0224 
{
	// main method begins execution of Java application
	public static void main(String[] args) 
	{
		// initialize variables
		int num;	// number for square and cube calculation
		
		System.out.println("number"+"\t"+"square"+"\t"+"cube");
		
		num = 0;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 1;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 2;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 3;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 4;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 5;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 6;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 7;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 8;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 9;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
		
		num = 10;
		System.out.printf("%d \t %d \t %d\n", (num), (num * num), (num * num * num));
	
	} // end method main

} // end class Exercise0224



/* Output:
number	square	cube
0 	 	0 	 	0
1 	 	1 	 	1
2 	 	4 	 	8
3 		9 	 	27
4 	 	16 	 	64
5 	 	25 	 	125
6 	 	36 	 	216
7 	 	49 	 	343
8 	 	64 	 	512
9 	 	81 	 	729
10 	 	100 	1000
 */
