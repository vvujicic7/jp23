package edunova;

import javax.swing.JOptionPane;

public class E07Vjezbanje {

	// Korisnik unosi decimalni broj
	// Program ispisuje samo decimalni dio broja
	public static void main(String[] args) {
		
		String b1 = JOptionPane.showInputDialog("Unesi broj1");
		
				double d= Double.parseDouble(b1);
				System.out.println(d);
				int p = (int)d;
				System.out.println(p);
				
	}
	
}