package zimski.zadatci;

import java.util.Scanner;  

public class Zadatak3 {
	// Kreirati program koji za dva unesena broja ispisuje sve prim/prosti/prime brojeve između njih.
	
	public static void main(String[] args) {
		
		 Scanner broj = new Scanner(System.in);  
	       System.out.print("Unesi prvi broj : ");  
	       int prvi = broj.nextInt();  
	       System.out.print("Unesi drugi broj : ");  
	       int drugi = broj.nextInt();  
	       System.out.println("Prime brojevi između " + prvi + " and " + drugi);
	       
	       for (int i = prvi; i <= drugi; i++) {
		     
	           if (isPrime(i)) { 
			   
	               System.out.println(i);  
	           }  
	       }  
	}

	private static boolean isPrime(int i) {
		// TODO Auto-generated method stub
		return false;
	} 
}