package edunova;

public class E03ZivotniVijekObjekta {
	
	// 1. faza deklarirali, vrijednost je null
	private Osoba osoba;
	
	public E03ZivotniVijekObjekta() {
		System.out.println(osoba);
		
		//NullPointerExeption
		//System.out.println(osoba.getIme());
		//2. faza konstruiranje
		// poziv konstruktora
		osoba = new Osoba(); // new je poziv konstrutora
		
		// 3. faza korištenje
		osoba.setIme("Pero");
		System.out.println(osoba.getIme());
		
		// 4. faza uništenje
		// mi ju ne radimo, radi ju GC
	}
	
	public static void main(String[] args) {
		new E03ZivotniVijekObjekta();
	}
	
	
	
	private class Osoba{
		
		private String ime;
		
		// 2. faza konstruktor - specifična metoda
		public Osoba() {
			// služi to da prilikom kreiranja nove instance
			// programer ima priliku nešto odraditi
			System.out.println("Konstruktor osobe");
		}
		
		

		public Osoba(String ime) {
			super();
			this.ime = ime;
		}



		public String getIme() {
			return ime;
		}

		public void setIme(String ime) {
			this.ime = ime;
		}
		
		
		
	}

}
