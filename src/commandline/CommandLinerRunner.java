package commandline;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLinerRunner {
	
	
	public static void main(String[] args) {
		
		
//		String[] commands = {"pa11y", "https://www.uscis.gov"};
		String[] commands = {"npm", "update"};
		ProcessBuilder processBuilder = new ProcessBuilder(commands);
		
		processBuilder.directory(new File(System.getProperty("user.home")));
		
		try {
			Process process = processBuilder.start();
			
			
			 BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			    
			    String line;
			    
			    while ((line = reader.readLine()) != null) {
			    	System.out.println(line);
			    }
			    
			    
			    int exitCode = process.waitFor();
			    
			    System.out.println("Exited with error code "+ exitCode);
			
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
	
}
