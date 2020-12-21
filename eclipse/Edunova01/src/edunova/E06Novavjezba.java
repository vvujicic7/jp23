package edunova;

import javax.swing.JOptionPane;

public class E06Novavjezba {
	public static void main(String[] args) {
		
	
	String unioKorisnik= JOptionPane.showInputDialog("Unesi decimalni broj");
	
	double doubleNumber = Double.parseDouble(unioKorisnik);
	int intPart = (int) doubleNumber;
	System.out.println("Double Number: " + doubleNumber);
	System.out.println("Integer Part: " + intPart);
	System.out.println("Decimal Part: " + (doubleNumber - intPart));

	}

}