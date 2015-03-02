package figures;

import java.util.Scanner;

/**
 * @author mychin
 * @date Mar 2, 2015
 * @time 7:06:10 PM
 * 
 * Fig 3.14: AccountTest.java
 * Inputting and outputting floating-point numbers with Account objects.
 */
public class AccountTest 
{
	// main method begins execution of Java application
	public static void main( String[] args ) 
	{
		Account account1 = new Account( 50.00 ); // create Account object
		Account account2 = new Account( -7.53 ); // create Account object
		
		// display initial balance of each object
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
		
		// create Scanner to obtain input from command window
		Scanner input = new Scanner ( System.in );
		double depositAmount; // deposit amount read from user
		
		System.out.print( "Enter deposit amount for account1: " ); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf("\nadding %.2f to account1 balance\n\n", depositAmount );
		account1.credit( depositAmount ); // add to account1 balance
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n\n", account2.getBalance() );
		
		System.out.print( "Enter deposit amount for account2: "); // prompt
		depositAmount = input.nextDouble(); // obtain user input
		System.out.printf( "\nadding %.2f to account2 balance\n\n", depositAmount );
		account2.credit( depositAmount ); // add to account2 balance
		
		// display balances
		System.out.printf( "account1 balance: $%.2f\n", account1.getBalance() );
		System.out.printf( "account2 balance: $%.2f\n", account2.getBalance() );
	} // end main

} // end class AccountTest



/* Output:
 * account1 balance: $50.00
 * account2 balance: $0.00
 * 
 * Enter deposit amount for account1: 25.53
 * 
 * adding 25.53 to account1 balance
 * 
 * account1 balance: $75.53
 * account2 balance: $0.00
 * 
 * Enter deposit amount for account2: 123.45
 * 
 * adding 123.45 to account2 balance
 * 
 * account1 balance: $75.53
 * account2 balance: $123.45
 * 
 */ 
