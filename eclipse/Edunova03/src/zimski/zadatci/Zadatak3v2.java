package zimski.zadatci;


public class Zadatak3v2 {
	// Kreirati program koji za dva unesena broja ispisuje sve prim/prosti/prime brojeve između njih.
	
	public static void main(String[] args) {
		
		int i = 0;
		int broj = 0;
		
		// prazan String
		String primeBrojevi = "";
		
		for (i = 1; i <= 100; i++) {
			int zbroj = 0;
			for(broj = i; broj >= 1; broj--) {
				if(i%broj == 0) {
					zbroj = zbroj + 1;
				}
			}
			if (zbroj == 2) {
				primeBrojevi = primeBrojevi + i + " ";
			}
		}
		System.out.println("Prime brojevi od 1 do 100 su :");
		System.out.println(primeBrojevi);
	
		
	}

}