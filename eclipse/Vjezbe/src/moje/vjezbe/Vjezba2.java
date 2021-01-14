package moje.vjezbe;

import java.util.Scanner;

public class Vjezba2 {

	// Korisnik unosi 3 broja,program ispisuje zbroj ta 3 broja

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Prvi broj:");

		int a = ulaz.nextInt();

		System.out.println("Drugi broj");

		int b = ulaz.nextInt();

		System.out.println("Treći broj");

		int c = ulaz.nextInt();

		ulaz.close();

		System.out.println(a + b + c);
	}

}
