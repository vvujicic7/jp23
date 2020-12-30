package edunova.zadaci;

import javax.swing.JOptionPane;

public class Zadatak5 {
	public static void main(String[] args) {
		
		String b1 = JOptionPane.showInputDialog("unesi cijeli broj");
		
		int b2 = Integer.parseInt(b1);
		System.out.println(b2%2 ==0?  "Osijek" : "Zagreb");
	}
	
	// Korisnik unosi cijeli broj
	// Ako je paran broj unesen ispiši Osijek
	// Ako je neparan broj unesen ispiši Zagreb
	
	// koristiti inline if

}
