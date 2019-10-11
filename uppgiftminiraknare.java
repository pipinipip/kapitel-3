

import javax.swing.*;
import java.util.Scanner;

public class uppgiftminiraknare { 
	public static void main(String[] args) {
		
		Scanner tgb = new Scanner(System.in);
		
		System.out.println("skriv ett räknesätt:");
		
		String operator = tgb.nextLine();
		
		System.out.println("skriv ett tal:");
		
		int tal1 = tgb.nextInt();
		
		System.out.println("skriv ett tal till:");
		
		int tal2 = tgb.nextInt();
		
		if (operator.equalsIgnoreCase("Addition")){
			
			System.out.println("Addition av " + tal1 + " och " + tal2 + " ger " + (tal1+tal2));
		}
		if (operator.equalsIgnoreCase("Subtraktion")){
			
			System.out.println("Addition av " + tal1 + " och " + tal2 + " ger " + (tal1-tal2));
		}
	}
}
