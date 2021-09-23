package day28_encapsulation;

import java.time.LocalDate;

public class Person {
	
	
	private String name;
	private int age;
	private char gender;
	private LocalDate dob;
	private String ssn;
	
	
	public Person(String name, int age, char gender, LocalDate dob, String ssn) {

		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dob = dob;
		this.ssn = ssn;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	
	// Apply encapsulation to person class.
	// Generate Constructor
	
	
	
	
	
	
	
	
	
	
}
