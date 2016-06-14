/**
 * 
 */
package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Cristine
 *
 */
public class RegexExemplo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Informe CPF\n");
		
		String cpf = scanner.next();
		
		Pattern pattern = Pattern.compile("\\d{3}\\.\\d{3}\\.\\{3}-\\d{2}");
		
	    Matcher matcher = pattern.matcher(cpf);	
	    
	    if (matcher.matches()) {
	    	System.out.println("cpf ok");
	    }else{
	    	System.out.println("cpf nok");	
	    	
	    }
	    
	    
	    
		
		scanner.close();
		
		
	}

}
