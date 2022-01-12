
// ATM - Machine
// User verification

import java.util.InputMismatchException;
import java.util.Scanner;
public class UserVerification
{
	public void showVerification()
	{
		Scanner input = new Scanner(System.in);

		String[] password = {"aaa,100","bbb,100"};
		int[] accountNumber = {987654321,987654320,};
		boolean continueLoop = true;

		System.out.println("\n\n");
		System.out.println("================================");
	    System.out.println("\tATM - MACHINE");
		System.out.println("================================");
		System.out.println("\n\tWELCOME\n\t-------");

		do{

			try
			{
				System.out.print("\nEnter account number: ");
				int account = input.nextInt();

				System.out.print("\nEnter password: ");
				String pin = input.next();

				if(((account==accountNumber[0])&&(pin.compareTo(password[0])==0))||
						((account==accountNumber[1])&&(pin.compareTo(password[1])==0)))
				{
					System.out.println("\n-------------------------------------");
					System.out.println("Welcome, "+account);
					System.out.println("-------------------------------------\n\n");
					continueLoop = false;
		
				}else {
					System.out.println("\n---------------------------------------------------");
					System.out.println("Incorrect account number or password, try again!");
					System.out.println("---------------------------------------------------\n\n");
				}

			}catch(InputMismatchException inputMismatchException)
			{
				input.nextLine();
				System.out.println("------------------------------------");
				System.out.println("Incorrect inputs, try again!");
				System.out.println("------------------------------------\n\n");

			}

		}while(continueLoop);
	}
}