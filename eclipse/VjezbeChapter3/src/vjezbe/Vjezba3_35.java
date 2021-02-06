package vjezbe;

import javax.swing.JOptionPane;

public class Vjezba3_35 {


	// Rewrite the following conditional expressions using if-else statements.
	// (a) a. score = (x > 10) ? 3 * scale : 4 * scale;
	
	// (b) b. tax = (income > 10000) ? income * 0.2 : income * 0.17 + 1000;
	
	// (c) c. System.out.println((number % 3 == 0) ? i : j);
	

	/* (a) public static void main(String[] args) {

		Object score;
		int scale = 0;
		int x = 0;
		if (x > 10)

			score = 3 * scale;
		else
			score = 4 * scale;
	}  */
	
	
	/* (b) public static void main(String[] args) {
		
		int income = 0;
		double tax;
		if (income > 10000)
			tax = income * 0.2;
		else 
			tax = income * 0.17 + 1000;
	} */
	
	public static void main(String[] args) {
		
		String s = JOptionPane.showInputDialog("Unesi broj");
		int number = Integer.parseInt(s);
		
		int i = 0;
		int j = 1;
				
		if (number % 3 == 0)
			System.out.println(i);
		else
			System.out.println(j);
	}
}  
