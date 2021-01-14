package moje.vjezbe;

import java.util.Scanner;

public class Vjezba1 {

	// Korisnik unosi 2 broja,program ispisuje zbroj ta dva broja

	public static void main(String[] args) {

		Scanner ulaz = new Scanner(System.in);

		System.out.println("Unesi prvi broj:");

		int i = ulaz.nextInt();

		System.out.println("Unesi drugi broj");

		int a = ulaz.nextInt();

		ulaz.close();

		System.out.println(i + a);

	}

}
