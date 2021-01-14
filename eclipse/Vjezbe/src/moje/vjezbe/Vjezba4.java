package moje.vjezbe;

import java.util.Scanner;

public class Vjezba4 {
	
	// Napiši program gdje korisnik unosi jedan broj a program 
	// ispisuje "ok" ako je broj manji od 5, ispisuje"ok2" 
	// ako je broj veći od 5, a manji od 10 i inače ispisuje "ok3"

	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesi broj:");
		int a = ulaz.nextInt();
		
		ulaz.close();
		
		
		if(a < 5) {
			System.out.println("ok");
		}else if( a > 5 & a < 10) {
			System.out.println("ok2");
		}else{
			System.out.println("ok3");
		}
		
	}
}
