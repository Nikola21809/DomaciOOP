package skola;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ucenik objekat1 = new Ucenik("Nikola", "Zivkovic", 3, 5.00, true);
		objekat1.setIme("Petar");
		objekat1.setPrezime("Petrovic");
		System.out.println("Ime: " + objekat1.getIme());
		System.out.println("Prezime: " + objekat1.getPrezime());
		System.out.println("Razred: " + objekat1.getRazred());
		objekat1.setProsek(4.75);
		System.out.println("Prosek: " + objekat1.getProsek());
		System.out.println("Da li je ucenik redovan: " + objekat1.isJeRedovan());
	}

}
