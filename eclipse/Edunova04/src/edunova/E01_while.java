package edunova;

public class E01_while {
	public static void main(String[] args) {
		
	// while radi s boolean tipom podatke
	
	
	int i=0;
	while(i<10) {
		System.out.println(i);
		i++;
		
	}
	
	i=0;
	boolean ostaniUpetlji=i<10;
	while(ostaniUpetlji) {
		System.out.println(i);
		ostaniUpetlji=++i<10;
	}
	
	i=0;
	
	while(i<10) {
		System.out.println(i++);
	}
	
	// provjerava uvjet na početku
	// postoji mogućnost da nikad ne
	
	i=20;
	while(i<10) {
		System.out.println("Ovo neće ispisati");
	}
	
	//
	while(true) {
		if(i++==20) {
			continue;
		}
		if(i==21) {
			break;
		}
	}
	i=0;
	int j=0;
	while(i<10) {
		while(j<10) {
			j++;
		}
		i++;
	}
}
}