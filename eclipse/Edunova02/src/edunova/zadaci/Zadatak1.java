package edunova.zadaci;

import javax.swing.JOptionPane;

public class Zadatak1 {
	
	// korisnik unosi cijeli broj. // Program ispisuje 1 ako ne neparan, 
	// 0 ako je paran

	public static void main(String[] args) {
		
		String b1 = JOptionPane.showInputDialog("broj");
		int i = Integer.parseInt(b1);
		System.out.println(i%2);
	}
}
