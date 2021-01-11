package edunova;

import java.util.Collections;
import java.util.List;

public class E03_foreach {
	
	public static void main(String[] args) {
		
		
		int[] niz = {1,2,4,4,3,3,4,3,4,4};
		
		for(int i=0;i<niz.length;i++) {
			System.out.println(niz[i]);
		}
		System.out.println("--------");
		// za svaku vrijednost u nizu
		for(int v : niz) {
			System.out.println(v);
		}
		System.out.println("--------");
		// ispiši unazad
		for(int i=niz.length-1;i>=0;i--) {
			System.out.println(niz[i]);
		}
		
		// s for each se ne može unazad
		
		// -nije gotovo List<String> lista = new ArrayList<>();
		
	
	}
}
