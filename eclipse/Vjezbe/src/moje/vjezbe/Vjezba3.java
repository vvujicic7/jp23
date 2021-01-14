package moje.vjezbe;

import java.util.Scanner;

public class Vjezba3 {
	
	// Korisnik unosi dva broja i ispisuje OK ako je prvi manje
	// ili jednako 10,a drugi veće ili jednako od 10
	
	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Prvi broj:");
		int a = ulaz.nextInt();
		System.out.println("Drugi broj:");
		int b = ulaz.nextInt();
		
		ulaz.close();
		
		if(a <= 10 && b >= 10) {
			System.out.println("OK");
		}else {
			System.out.println("NIJE OK");
		}
		
	}

}
