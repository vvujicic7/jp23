package edunova;

import javax.swing.JOptionPane;

public class E04Vjezbanje {
	
	// Korisnik unosi dva cijela broja, 
	// program ispisuje brojeve jedan pored drugog
	
	public static void main(String[] args) {
		
		String br1 = JOptionPane.showInputDialog("Prvi broj");
		String br2= JOptionPane.showInputDialog("Drugi broj");
		int b1 =Integer.parseInt(br1);
		int b2 =Integer.parseInt(br2);
		System.out.println(b1 +" "+b2);
	}
	

}
