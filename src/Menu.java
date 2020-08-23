import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		System.out.println("########### Bank Account ###########");
		System.out.println("Welcome to your bank!");
		System.out.println("What kind option do you want?");
		System.out.println("1) Create an account.");
		System.out.println("2) Create a withdraw.");
		System.out.println("3) Create a transfer.");
		System.out.println("4) Create a deposit.");
		System.out.println("5) Get your statement.");
		
		Scanner scanner = new Scanner(System.in);
		BankAccount bankAccount = new BankAccount();
		
		System.out.print("Option: ");
		int option = scanner.nextInt();
			
		while (option > 0 && option <= 5) {
			System.out.println("Option: " + option);
			
			if (option == 1) {
				System.out.println("########### Creating an account... ###########");
				
				System.out.print("Owner: ");
				String owner = scanner.next();
				System.out.print("Agency: ");
				String agency = scanner.next();
				System.out.print("Account: ");
				String account = scanner.next();
				
				bankAccount.setOwner(owner);
				bankAccount.setAgency(agency);
				bankAccount.setAccount(account);
				bankAccount.setAmount(100.00);
				
				System.out.println(bankAccount.toString());
				
			} else if (option == 2) {
				System.out.println("########### Creating a withdraw... ###########");
				double amount = bankAccount.getAmount();
				
				System.out.print("Value: ");
				double value = scanner.nextDouble();
				
				if (value <= amount) {
					bankAccount.setAmount(amount - value);
					System.out.println(bankAccount.toString());
				} else {
					System.out.println("Insufficient amount.");
				}
				
			} else if (option == 3) {
				System.out.println("########### Creating a transfer... ###########");
				
			} else if (option == 4) {
				System.out.println("########### Creating  deposit... ###########");
				
			} else if (option == 5) {
				System.out.println("########### Taking the statement... ###########");
				System.out.println(bankAccount.toString());
				
			} 
			
			System.out.print("Option: ");
			option = scanner.nextInt();
		}
		
		if (option < 0 || option > 5) {
			System.out.println("Thanks for comming...");
			scanner.close();
		}
		
	}
}
