package edunova.pojasnjenje;

public class Start {
	
	public Start() {
		System.out.println(StaticnaKlasa.odradiPosao());
		
		Racun[] niz = new Racun[200];
		
		Racun r = new Racun();
		r.setKupac("Edunova");
		
		niz[0]=r;
		
		try {
			Thread.sleep(2*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		r=new Racun();
		r.setKupac("Biroprint");
		
		niz[1]=r;
		
		for (int i = 0; i < niz.length; i++) {
			System.out.println(niz[i].getDatumKreiranja());
		}
		
	}
	
	public static void main(String[] args) {
		new Start();
	}

}
