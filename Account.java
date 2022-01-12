
import java.util.Scanner;
import java.util.InputMismatchException;
public class Account
{	
	Scanner input = new Scanner(System.in);

	private double balance = 10000;

	public double getBalance()
	{
		return balance;
	}

	public double calcDeposit(double amount) 
	{
		balance = (balance + amount);
		return balance;
	}

	public double calcWithdraw(double amount) 
	{
		balance = (balance - amount);
		return balance;
	}

	public void getDeposit()
	{
		double amount;

		System.out.print("\nEnter amount to be deposited: ");
		amount = input.nextDouble();
		
		calcDeposit(amount);
		System.out.println("\n-----------------------------------------------");
		System.out.printf("Tsh %.2f has deposited successfully\n",amount);
		System.out.printf("New balance now is Tsh %.2f\n",balance);
		System.out.printf("Available balance now is Tsh %.2f\n",getBalance());
		System.out.println("----------------------------------------------\n");
		
	}

	public void getOptionalMenu()
	{

		try{	
			System.out.println("\nChoose operation you want to perform: ");
			System.out.println("1. Withdraw");
			System.out.println("2. Deposit");
			System.out.println("3. View balance");
			System.out.println("4. Exit");
			System.out.print("\nselection a choice: ");

			int choice = input.nextInt();

			switch (choice) 
			{
				case 1:
				getWithdraw();
				break;

				case 2:
				getDeposit();
				getOptionalMenu();
				break;

				case 3:
				System.out.println("\n-----------------------------------------------");
				System.out.printf("New balance now is Tsh %.2f\n",balance);
				System.out.printf("Available balance now is Tsh %.2f\n",getBalance());
				System.out.println("----------------------------------------------\n");
				getOptionalMenu();
				break;

				case 4:
				System.out.println("\n--------------------------------");
				System.out.println("Thanks For Using Your Bank");
				System.out.println("--------------------------------\n\n");
				System.exit(0);
				break;

				default:
				System.out.println("--------------------------------");
				System.out.println("Incorrect choice, try again!");
				System.out.println("--------------------------------\n");
			}

		}catch(InputMismatchException inputMismatchException)
		{
			System.out.println("----------------------------------------");
			input.nextLine();
			System.out.println("You must enter an integer value.");
			System.out.println("----------------------------------------\n\n");
		}	
		getOptionalMenu();
	}

	public void getWithdraw()
	{
		try{
			System.out.println("\nWithdrawal Menu:");
			System.out.println("1. 2,000");
			System.out.println("2. 3,000");
			System.out.println("3. 5,000");
			System.out.println("4. Exit");
			System.out.print("\nSelect a choice: ");
			
			double amount=0;
			int choice = input.nextInt();

			if(balance>=6000.0)
			{
				switch(choice)
				{
					case 1:
					amount=2000;
					balance=balance-amount;
				  	System.out.println("----------------------------------------------");
				  	System.out.println("Withdrawn process successfully");
				  	System.out.printf("Withdrawn balance: Tsh %.2f\n",amount);
				  	System.out.printf("Available balance: Tsh %.2f\n",balance);
				  	System.out.printf("Total balance: Tsh %.2f\n",getBalance());
				  	System.out.println("\nPlease collect your cash now");
				  	System.out.println("----------------------------------------------\n");
					getOptionalMenu();
					break;

					case 2:
					amount=3000;
					balance=balance-amount;
				  	System.out.println("----------------------------------------------");
				  	System.out.println("Withdrawn process successfully");
				  	System.out.printf("Withdrawn balance: Tsh %.2f\n",amount);
				  	System.out.printf("Available balance: Tsh %.2f\n",balance);
				  	System.out.printf("Total balance: Tsh %.2f\n",getBalance());
				  	System.out.println("\nPlease collect your cash now");
				  	System.out.println("----------------------------------------------\n");
					getOptionalMenu();
					break;

					case 3:
					amount=5000;
					balance=balance-amount;
				  	System.out.println("----------------------------------------------");
				  	System.out.println("Withdrawn process successfully");
				  	System.out.printf("Withdrawn balance: Tsh %.2f\n",amount);
				  	System.out.printf("Available balance: Tsh %.2f\n",balance);
				  	System.out.printf("Total balance: Tsh %.2f\n",getBalance());
				  	System.out.println("\nPlease collect your cash now");
				  	System.out.println("----------------------------------------------\n");
					getOptionalMenu();
					break;

					case 4:
					getOptionalMenu();
					break;

					default:
					System.out.println("\n-------------------------------------");
					System.out.println("Incorrect choice, try again");
					System.out.println("-------------------------------------\n");	
					getOptionalMenu();					
				}

			}else{
				System.out.println("\n-----------------------------------------");
				System.out.println("Insuffiency balance, transaction fail");
				System.out.println("-------------------------------------------\n");
			}
			getOptionalMenu();

		}catch(InputMismatchException inputMismatchException){
			System.out.println("----------------------------------------------");
			input.nextLine();
			System.out.println("You must enter an integer value.");
			System.out.println("----------------------------------------------\n");

		}
		getOptionalMenu();

	}

}
