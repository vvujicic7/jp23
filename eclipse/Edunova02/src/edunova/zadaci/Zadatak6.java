package edunova.zadaci;

import javax.swing.JOptionPane;

public class Zadatak6 {
	
	public static void main(String[] args) {
		
		String b1 = JOptionPane.showInputDialog("unosi broj");
		String b2 = JOptionPane.showInputDialog("unosi broj");
		
		int b11 = Integer.parseInt(b1);
		int b22 = Integer.parseInt(b2);
		
		if((b11*b22)%2==0) {
			System.out.println(b11-b22);
	}else {
		System.out.println((int)(b11/b22));
		}
	}
	
}
	// Korisnik unosi 2 broja. 
	// Ukoliko je produkt ta dva broja paran broj
	// ispisuje razliku unesinih brojeva
	// inače ispisuje cijeli dio kvocjenta prvog i drugog broja

// prepisao od Ive, bilo kakvi unosi davaju 0 ... nije dobro
