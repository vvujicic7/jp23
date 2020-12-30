package edunova.zadaci;

import javax.swing.JOptionPane;

public class Zadatak4 {

	public static void main(String[] args) {
		
		String b1 = JOptionPane.showInputDialog("broj");
		String b2 = JOptionPane.showInputDialog("broj");
		String b3 = JOptionPane.showInputDialog("broj");
		
		int i = Integer.parseInt(b1);
		int j = Integer.parseInt(b2);
		int k = Integer.parseInt(b3);
		
		if(i>=j & i>=k) {
			System.out.println(i);
		}
		
		if(j>i & j>k) {
			System.out.println(j);
		}
		
		if(k>j & k>i) {
			System.out.println(k);
		}
		}
	// Korisnik unosi 3 cijela broja 
	// program ispisuje najveći
}

