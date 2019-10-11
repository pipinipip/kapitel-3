

import javax.swing.*;
import java.util.Scanner;

public class uppgift51 { 
	public static void main(String[] args) {
		String s = JOptionPane.showInputDialog ("n?");
		int n = Integer.parseInt (s) ;
		int summa=0;
		int k=1;
		while (k <= n) {
			summa = summa + (int)Math.pow(k, 2);
			System.out.println("K: " + k + ", K^2: " + Math.pow(k, 2) + ", Summa: " + summa);
			k = k + 1;
		}
		JOptionPane.showMessageDialog(null, "Summan blir " + summa);
	}
}