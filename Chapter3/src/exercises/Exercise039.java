package exercises;

/**
 * @author mychin
 * @date Mar 3, 2015
 * @time 3:53:02 PM
 * 
 * Exercise 3.9
 * Modify class Account (Fig. 3.13) to provide a method called debit that withdraws money from an Account.
 * Ensure that the debit amount does not exceed the Account's balance.
 * If it does, the balance should be left unchanged and the method should print a message indicating
 * "Debit amount exceeded account balance."
 * Modify class AccountTest (Fig. 3.14) to test method debit.
 * 
 */
public class Exercise039 
{
	private double balance;	// instance variable that stores the balance
	
	// constructor
		public Exercise039 ( double initialBalance ) 
		{
			// validate that initialBalance is greater than 0.0;
			// if it is not, balance is initialized to the default value 0.0
			if ( initialBalance > 0.0 )
				balance = initialBalance;
		} // end Account constructor
		
		// credit (add) an amount to the account
		public void credit( double amount )
		{
			balance = balance + amount;	// add amount to balance
		} // end method credit
		
		// debit (deduct) an amount to the account
		public void debit( double debitAmount )
		{
			 
			 
			if (debitAmount > balance)
			{
				debitAmount = 0.0;
				System.out.println( "Debit amount exceeded account balance." );
			}
			balance = balance - debitAmount;
		} // end method debit
		
		// return the account balance
		public double getBalance()
		{
			return balance; // gives the value of balance to the calling method
		} // end method getBalance
		
} // end class Exercise039
