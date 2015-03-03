/**
 * 
 */
package exercises;

import java.util.Scanner; // program uses class Scanner

/**
 * @author mychin
 * @date Mar 3, 2015
 * @time 4:34:21 PM
 */
public class Exercise039Test 
{
	// main method begins program execution
	public static void main(String[] args) 
	{
		Exercise039 account1 = new Exercise039( 50.00 ); // create Exercise039 object
		Exercise039 account2 = new Exercise039( -7.53 ); // create Exercise039 object
		
		// display initial balance of each object
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
		
		// create Scanner to obtain input from command window
		Scanner input = new Scanner ( System.in );
		double withdrawAmount; // debit amount read from user
		
		System.out.print( "Enter debit amount for account1: " ); // prompt
		withdrawAmount = input.nextDouble(); // obtain user input
		System.out.printf("\ndeducting %.2f from account1 balance\n\n", withdrawAmount );
		account1.debit(withdrawAmount); // deduct from account1 balance
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
		
		System.out.print( "Enter withdraw amount for account2: "); // prompt
		withdrawAmount = input.nextDouble(); // obtain user input
		System.out.printf( "\ndeducting %.2f from account2 balance\n\n", withdrawAmount );
		account2.debit( withdrawAmount ); //deduct from account2 balance
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
	} // end main
} // end class Exercise039Test
