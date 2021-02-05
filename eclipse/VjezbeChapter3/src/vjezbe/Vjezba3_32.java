package vjezbe;

import javax.swing.JOptionPane;

public class Vjezba3_32 {
	
	// Write a switch statement that displays Sunday, Monday, Tuesday, Wednesday,
	// Thursday, Friday, Saturday, if day is 0, 1, 2, 3, 4, 5, 6, accordingly.
	
	public static void main(String[] args) {
		
		String unioKorisnik = JOptionPane.showInputDialog("Unesi broj");
		int day = Integer.parseInt(unioKorisnik);
		switch (day) {
		
		case 0: System.out.println("Monday"); break;
		case 1: System.out.println("Tuesday"); break;
		case 2: System.out.println("Wednesday"); break;
		case 3: System.out.println("Thursday"); break;
		case 4: System.out.println("Friday"); break;
		case 5: System.out.println("Saturday"); break;
		case 6: System.out.println("Sunday"); break;
		}
	}

}
