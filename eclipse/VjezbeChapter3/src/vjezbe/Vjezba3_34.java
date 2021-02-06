package vjezbe;

public class Vjezba3_34 {
	
	private static int ages;

	/* Rewrite the following if statements using the conditional operator.
	
	if (ages >= 16)
	ticketPrice = 20;
	else
	ticketPrice = 10; 
	
	*/

	public static void main(String[] args) {
		
		int ticketPrice;
		ticketPrice = (ages >= 16) ? 20 : 10;
		System.out.println(ticketPrice);
	}
}