package edunova.polimorfizam.pozornica;

import java.math.BigDecimal;

public class Polaznik extends Osoba{
	
	private String brojUgovora;

	@Override
	public String getPozdrav() {
		return "Ja sam " + getIme() + ", moj broj ugovora je "
				+ getBrojUgovora();
	}

	public String getBrojUgovora() {
		return brojUgovora;
	}

	public void setBrojUgovora(String brojUgovora) {
		this.brojUgovora = brojUgovora;
	}

	@Override
	protected BigDecimal getIznos() {
		return BigDecimal.ZERO;
	}
	

}
