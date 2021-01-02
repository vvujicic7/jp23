package edunova;

public class E02ForPetlja {
	
	public static void main(String[] args) {
		
		// koristi se kada znate od kuda, do kuda i u kojem koraku idete
		
		// for(od kuda; do kuda; korak)
		
		for(int i=0; i<10; i++) {
			System.out.println("Osijek");
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(i);
		}
		
		
		// zbroj prvih 100 brojeva
		int zbroj=0;
		for(int i=1;i<=100;i++) {
			zbroj+=i;
		}
			System.out.println(zbroj);
		
		
	}

}
