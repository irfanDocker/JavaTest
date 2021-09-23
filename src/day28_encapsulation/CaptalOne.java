package day28_encapsulation;

public class CaptalOne {
	public static void main(String[] args) {
		
		BankAccount ba = new BankAccount();
		
		ba.getInfo();
		
		ba.accountName = "Nadia";
		ba.accountNumber= "89798776";
		
		ba.showBalance();
		
		ba.deposit(4000);
		
		ba.getInfo();
		
		ba.deposit(4000);
		
		ba.getInfo();
		ba.deposit(4000);
		ba.deposit(4000);
		
		ba.deposit(4000);
		ba.deposit(4000);
		
		ba.deposit(4000);
		ba.deposit(4000);
		
		ba.deposit(4000);
		ba.deposit(4000);
		
		ba.deposit(4000);
		ba.deposit(4000);
		
		ba.getInfo();
		
		
		ba.withdraw(40000);
		
		ba.showBalance();
		
		
		
	}
}
