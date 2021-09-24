package day29_inheritance;

public class School {

	public static void main(String[] args) {
		
		JavaTeacher jt = new JavaTeacher();
		
		System.out.println(jt.mainSubject); // Java
		
		System.out.println(jt.getCollegeName());
		
		System.out.println(jt.getDesignation());
		
		jt.does();
		
		
		

	}

}
