package vjezbe;

public class Vjezba3_31 {
	
	/*What is x after the following if-else statement is executed? Use a switch statement
			to rewrite it and draw the flowchart for the new switch statement.
			int x = 1, a = 3;
			if (a == 1)
			x += 5;
			else if (a == 2)
			x += 10;
			else if (a == 3)
			x += 16;
			else if (a == 4)
			x += 34; */
	
	public static void main(String[] args) {
		
		int x = 1, a = 3;
		
		switch (x += 5) {
			case 1: a = 1;
		
		switch (x +=10 ) {
			case 2: a = 2;
		
		switch (x += 16) {
			case 3: a = 3;
		
		switch (x += 34) {
			case 4: a = 4;
					}
				}
			}
		}
	}
}
