package edunova.zadaci;

import javax.swing.JOptionPane;

public class Zadatak6 {
	
	public static void main(String[] args) {
		
		String a = JOptionPane.showInputDialog("unosi broj");
		String b = JOptionPane.showInputDialog("unosi broj");
		
		int c = Integer.parseInt(a);
		int d = Integer.parseInt(b);
		
		if((c*d)%2==0) {
			System.out.println(c-d);
	}else {
		System.out.println((int)(c/d));
		}
	}
	
}
	// Korisnik unosi 2 broja. 
	// Ukoliko je produkt ta dva broja paran broj
	// ispisuje razliku unesinih brojeva
	// inače ispisuje cijeli dio kvocjenta prvog i drugog broja

// prepisao od Ive, bilo kakvi unosi davaju 0 ... nije dobro- DOBRO JE- promijenio nazive String-a i int-a
