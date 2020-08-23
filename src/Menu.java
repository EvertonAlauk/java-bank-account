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
		
		System.out.print("Option: ");
		String option = scanner.next();
		
		if (option.equals("1")) {
			
			System.out.println("########### Creating an account... ###########");
			System.out.print("Owner: ");
			String owner = scanner.next();
			System.out.print("Agency: ");
			String agency = scanner.next();
			System.out.print("Account: ");
			String account = scanner.next();
			
			BankAccount bankAccount = new BankAccount();
			bankAccount.setOwner(owner);
			bankAccount.setAgency(agency);
			bankAccount.setAccount(account);
			
			System.out.println(bankAccount.toString());
			
		}
		
		else if (option.equals("2")) {
			
			System.out.println("########### Creating an withdraw... ###########");
			
		}
		
		else if (option.equals("3")) {
			
			System.out.println("########### Creating an withdraw... ###########");
			
		}
		
		else if (option.equals("4")) {
			
			System.out.println("########### Creating an withdraw... ###########");
			
		}
		
		else if (option.equals("5")) {
			
			System.out.println("########### Creating an withdraw... ###########");
			
		}

	}
}
