package day28_encapsulation;

public class Data {

	public static void main(String[] args) {
		
		Credentials c = new Credentials();
		
//		System.out.println(c.);
		
		System.out.println(c.getUserName());
		System.out.println(c.getPassword());
		
		c.setUserName("techcircle@techcirclesolutions.org");
		c.setPassword("Password@1");
		
		
		System.out.println(c.getUserName());
		System.out.println(c.getPassword());
		
		

	}

}
