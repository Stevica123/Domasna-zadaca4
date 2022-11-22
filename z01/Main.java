package fikt.inki.oop.z01;

public class Main {
	
	public static void main(String[] args) {
		Covek c = new Covek ();
		c.setIme("Рајко");
		c.setPrezime("Марковски");
		c.setEmbg("2410993485003");
		
		System.out.println("Ime: " + c.getIme());
		System.out.println("Prezime: " + c.getPrezime());
		System.out.println("EMBG: " + c.getEmbg());
	}

}
