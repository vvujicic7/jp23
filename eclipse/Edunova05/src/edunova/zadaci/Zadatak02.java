package edunova.zadaci;

import java.util.Scanner;

public class Zadatak02 {

	// Program unosi 2 broja od korisnika
	// Program ispisuje razliku kao rezultat izvođenja 
	// metode koja prima dva parametra i tipa je float
	// 65min 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Unesi dva broja: ");
		
		float a = input.nextFloat();
		float b = input.nextFloat();
		
		System.out.println(razlika(a, b));
	}
	public static float razlika(float a, float b) {
		return a - b;
		
	}
}
