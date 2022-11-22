package fikt.inki.oop.z02;

public class Main {
	
	public static void main (String[] args) {
		Restoran obj1 = new Restoran ();
		
		obj1.setIme("Treff");
		obj1.setLokacija("126 Shirok Sokak");
		obj1.setTelefon("076355702");
		obj1.setBrNaSedista(90);
		
		System.out.println(obj1.getIme());
		System.out.println(obj1.getLokacija());
		System.out.println(obj1.getTelefon());
		System.out.println(obj1.getBrNaSedista());
	}
}
