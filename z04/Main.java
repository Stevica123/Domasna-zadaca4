package fikt.inki.oop.z04;

public class Main {
	public static void main (String[] args) {
		Avtomobil obj1 = new Avtomobil ("Audi", "Q7", "plava", 180000);
		
		obj1.mnozenjeKm(2);
		System.out.println(obj1.getMarka());
		System.out.println(obj1.getModel());
		System.out.println(obj1.getBoja());
		System.out.println(obj1.getPominatiKm());
		
	}
}


