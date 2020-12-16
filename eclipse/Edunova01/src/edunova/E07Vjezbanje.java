package edunova;

import javax.swing.JOptionPane;

public class E07Vjezbanje {

	// Korisnik unosi decimalni broj
	// Program ispisuje samo decimalni dio broja
	public static void main(String[] args) {
		
		String b1 = JOptionPane.showInputDialog("Unesi broj1");
		float f1 = Float.parseFloat(b1);
		int c=(int)f1;
		System.out.println(f1/c);
	}
}
