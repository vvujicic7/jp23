package edunova.zadaci;

import java.util.Scanner;

public class Zadatak1 {

	// Program unosi brojeve sve dok ne dođe broj -1
	//Program ispisuje sumu svih unesenih bojeva
	public static void main(String[] args) {
		
		Scanner ulaz = new Scanner(System.in);
		
		System.out.println("Unesi brojeve: ");
		
		int i = 0, zbroj = 0;
		
		while (i != -1) {
			i = ulaz.nextInt();
			if(i != -1) {
				zbroj += i;
			}
		}
		System.out.println(zbroj);
	}
	
}
