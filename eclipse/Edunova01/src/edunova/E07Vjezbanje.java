package edunova;

import javax.swing.JOptionPane;

public class E07Vjezbanje {

	// Korisnik unosi decimalni broj
	// Program ispisuje samo decimalni dio broja
	public static void main(String[] args) {
		
		String uniokorisnik= JOptionPane.showInputDialog("Unesi decimalni broj");
		
		double doubleNumber= Double.parseDouble(uniokorisnik);
		
		int intPart = (int) doubleNumber;
		System.out.println("Double number:" + doubleNumber);
		System.out.println("Integer part:" + intPart);
		System.out.println("Decimal part" + (doubleNumber - intPart));
		
			
				
	}
	
}