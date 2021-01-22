package moje.vjezbe;

import java.util.Scanner;

public class Vjezba18 {
	
	// Ispiši brojeve od 1 - 5
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	System.out.println("Enter number: ");
	int i = input.nextInt();
		
		
		if(i==2) {
			System.out.println("OK");
		}else if(i==3) {
			System.out.println("NOT OK");
		}
		
		
	}	

}
