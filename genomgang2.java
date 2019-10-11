

import javax.swing.*;
import java.util.Scanner;

public class genomggang2 { 
	public static void main(String[] args) {
		String pwd = "secret";
		String yourpwd = "somrthing else";
		
		if (yourpwd.equals(pwd)) {
			System.outprintln("password is correct")
			
		} else { 
			System.outprintln("password is not correct")
		}
		
		
		// annan sak
		int age = 19;
		if (age <= 6) {
			fee = 0			
		} else if (age <= 20) {
			fee = 10;
		} else if (age <= 26) {
			fee = 15;
		} else if (age <= 65) {
			fee = 20;
		} else {
			fee = 15;
		}
		
		// case stuffs
		int month = 10;
		int days;
		switch (month) {
			case 1:
			case 2:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				days = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				days = 30;
				break;
			case 2:
			days = 28;
			break;
			default;
			System.out.println("det finns bara 12 månader")
			
		}
		
		
	}
}
