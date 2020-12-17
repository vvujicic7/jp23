package edunova;

import javax.swing.JOptionPane;

public class E06Vjezbanje {

	// Korisnik unosi decimalni broj
	// program ispisuje samo cijeli dio broja
	public static void main(String[] args) {
		String b=JOptionPane.showInputDialog("decimalni broj");
		float f=Float.parseFloat(b);
		System.out.println(f);
		int p=(int)f;
		System.out.println(p);
		
	}
}
