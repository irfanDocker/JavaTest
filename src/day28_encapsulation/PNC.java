package day28_encapsulation;

public class PNC {
	public static void main(String[] args) {
		
		BankAccount account = new BankAccount();
		
		account.accountName = "Ariuna";
		
		account.accountNumber= "24534345345";
		
		account.showBalance();
		
		account.deposit(10000);
		
		account.deposit(10000);
		account.showBalance();
		
		account.withdraw(5000);
		
		account.getInfo();
		
		
	}
}
