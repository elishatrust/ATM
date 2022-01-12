
// ATM-Machine
// Main operation function

import java.util.Scanner;
import java.util.InputMismatchException;
public class ATM
{
	public static void main(String[] args) 
	throws ArithmeticException

	{
		UserVerification userVerfication = new UserVerification();
		userVerfication.showVerification();

		Account account = new Account();
		account.getOptionalMenu();
		
		
	}
}