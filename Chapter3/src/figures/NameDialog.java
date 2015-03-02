package figures;

import javax.swing.JOptionPane; // import class JOptionPane

/**
 * @author mychin
 * @date Mar 2, 2015
 * @time 9:24:06 PM
 * 
 * Fig. 3.18: NameDialog.java
 * Basic input with a dialog box.
 */
public class NameDialog 
{
	public static void main(String[] args) 
	{
		// prompt user to enter name
		String name = JOptionPane.showInputDialog( "What is your name?" );
		
		// create the message
		String message = String.format( "Welcome, %s, to Java Programming!", name);
		
		// display the message to welcome the user by name
		JOptionPane.showMessageDialog( null, message);
	} // end main

} // end class NameDialog
