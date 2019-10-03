

import javax.swing.*;
import java.util.Scanner;

public class uppgift42 { 
	public static void main(String[] args) {
		
		Scanner tgb = new Scanner(System.in);
		
		System.out.println("hur mycket kostar ett arskort?:");
		
		int arskort = tgb.nextInt();
		
		System.out.println("hur mycket kostar en engangsbilljatngsbilljat?:");
		
		int biljat = tgb.nextInt();
		
		System.out.println("hu magn gang du gym pa ar?:");
		
		int manggang = tgb.nextInt();
		
		if (biljat * manggang > arskort) {
		JOptionPane.showMessageDialog(null, "arskort billigare");
		}
		else {
		JOptionPane.showMessageDialog(null, "biljat billigare");
		}
	}
}
		
