

import javax.swing.*;
import java.util.Scanner;

public class areaundergraf { 
	public static void main(String[] args) {
		double start = 0;
		double slut = 3.4;
		double area = 0;
		
		int antalRektanglar = 2000000000;
		double deltax = (slut-start)/antalRektanglar;
		
		double x = start;
		while (x<slut) {
			area += (0.5*x*x*x-2*x*x+x+3)*deltax;
			x += deltax;
		}
			System.out.printf("area under grafen \u00e4r %.3f" ,area);
		
		
		
		
		
		
		}
		
		
		
	}

