

import javax.swing.*;
import java.util.Scanner;

public class uppgift43 { 
	public static void main(String[] args) {
		int poang =Integer.parseInt(JOptionPane.showInputDialog(null,"hur manga poang fick du"));
		
		if (poang < 25) {
			JOptionPane.showMessageDialog(null,"noob du fick f");
		} else if (poang < 30) {
			JOptionPane.showMessageDialog(null,"noob du fick e");
		} else if (poang < 35) {
			JOptionPane.showMessageDialog(null,"noob du fick d");
		} else if (poang < 40) {
			JOptionPane.showMessageDialog(null,"noob du fick c");
		} else if (poang < 45) {
			JOptionPane.showMessageDialog(null,"noob du fick b");
		} else if (poang < 50) {
			JOptionPane.showMessageDialog(null,"noob du fick a");
		} else if (poang > 50) {
			JOptionPane.showMessageDialog(null,"noob du fusk");
		}
		
		
		
	}
}
