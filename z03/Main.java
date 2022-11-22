package fikt.inki.oop.z03;

public class Main {
	
	public static void main(String[] args) {
		Proizvod p = new Proizvod ();
		System.out.println("Ime na prozivod: " + p.getIme());
		System.out.println("Proizvoditel: " + p.getProizvoditel());
		System.out.println("Cena: " + (int)p.getCena() + "denari.");
		System.out.println("Tezhina: " + p.getTezhina() + "grama.");
	}

}
