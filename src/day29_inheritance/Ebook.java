package day29_inheritance;

public class Ebook extends Book{
	
	int size;
	int page;
	
	
	void readBook() {
		
		System.out.println("Reading book : ");
		System.out.println("Title : "+title);
		System.out.println("Author : "+author);
		System.out.println("size : "+size);
		System.out.println("page : "+page);
		System.out.println("price : "+price);
		
	}
	
	
}
