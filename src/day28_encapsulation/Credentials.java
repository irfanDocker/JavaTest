package day28_encapsulation;

public class Credentials {
	
	private String userName = "techcircle";
	private String password = "abc123";
	
	
	public String getUserName () {
		return this.userName;
	}
	
	public String getPassword () {
		return this.password;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
