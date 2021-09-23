package day28_encapsulation;

import java.time.LocalDate;

public class BankAccount {
	
	String accountName;
	String accountNumber;
	double availableBalance;
	
	
	
	public BankAccount() {}


	public BankAccount(String accountName, String accountNumber) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
	}

	public void deposit(double amount) {
		availableBalance += amount;
	}
	
	public void withdraw(double amount) {
		availableBalance -= amount;
	}
	
	public void showBalance() {
		System.out.println("As of today "+ LocalDate.now() + ", "+accountName + " available balance is $"+availableBalance );
	}
	
	public void getInfo() {
		System.out.println("================================");
		System.out.println("Date "+ LocalDate.now());
		System.out.println("Account name "+accountName);
		System.out.println("Account number "+ accountNumber);
		System.out.println("Available balance "+ availableBalance);
		System.out.println("================================");
	}
	
	
	
	
}
