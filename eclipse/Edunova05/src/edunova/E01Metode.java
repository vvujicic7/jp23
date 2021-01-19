package edunova;

import javax.swing.JOptionPane;

import static edunova.E05MetodeV4.slucajniBroj;

/**
 * Učenje metoda
 * @author Velimir Vujičić
 * 2021
 *
 */

public class E01Metode {
	
	static int naRaziniKlase;
	
	/**
	 * public - način pristupa
	 * @param args
	 */
	
	public static void main(String[] parametarMetode) {
		int unutarMetode=0;
		System.out.println("Hello");
		
		E02MetodaV1.odradiPosao();
		E02MetodaV1.packageScope();
		//E02MetodaV1.nijeStatic(); 
		
		E03MetodeV2.ispisi(2, 3);
		
		E04MetodeV3.zbroji(3, 3);
		int rez = E04MetodeV3.zbroji(7, 6);
		System.out.println(rez);
		
		var r = E04MetodeV3.zbroji(7, 6);
		
		System.out.println(r);
		
		System.out.println(E04MetodeV3.zbroji(2, 4));
		//
		System.out.println(apsolutnaVrijednost(-2));
		
		System.out.println(E01Metode.apsolutnaVrijednost(1));
		
		System.out.println(slucajniBroj());
	}
	
	static int apsolutnaVrijednost(int i) {
		return i*-1;
	}
	
	static boolean isPrime(int number, int prvaVerzija) {
		boolean prime=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				prime=false;
			}
		}
		return prime;
	}
	static boolean isPrime(int number, char drugaVerzija) {
		boolean prime=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				prime=false;
				break;
			}
		}
		return prime;
	}
	static boolean isPrime(int number, boolean najboljaVerzija) {
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				return false; // short curcuiting
			}
		}
		return true;
	}
	
	

}
