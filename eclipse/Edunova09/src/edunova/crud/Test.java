package edunova.crud;

import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.swing.JOptionPane;

public class Test {
	
	public static void main(String[] args) {
		SimpleDateFormat df = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
		Date datum;
		try {
			datum = df.parse(JOptionPane.showInputDialog("Unesi datum"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();	
	}
	// nije gotovo

}
}