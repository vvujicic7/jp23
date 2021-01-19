package edunova.zadaci;

import javax.swing.JOptionPane;

public class Zadatak01 {
	// Upogonite smisleno svih 6 različitih  naziv metode
	// JOptionPane.showInputDialog
	public static void main(String[] args) {
		
		JOptionPane.showConfirmDialog(null, "Metode učimo");
		JOptionPane.showConfirmDialog(null, null, null, 0);
		JOptionPane.showConfirmDialog(null, args, null, 0, 0);
		JOptionPane.showConfirmDialog(null, "Javva", "Javino", 3, 4, null);
		JOptionPane.showInputDialog(null);
		JOptionPane.showInputDialog(null, null);
	}

}
