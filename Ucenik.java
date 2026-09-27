package skola;

public class Ucenik 
{
	private String ime;
	private String prezime;
	private int razred;
	private double prosek;
	private boolean jeRedovan;
	public Ucenik (String ime, String prezime,int razred, double prosek, boolean jeRedovan) 
	{
		this.ime = ime;
		this.prezime = prezime;
		this.razred = razred;
		this.prosek = prosek;
		this.jeRedovan = jeRedovan;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getRazred() {
		return razred;
	}
	public void setRazred(int razred) {
		this.razred = razred;
	}
	public double getProsek() {
		return prosek;
	}
	public void setProsek(double prosek) {
		this.prosek = prosek;
	}
	public boolean isJeRedovan() {
		return jeRedovan;
	}
	public void setJeRedovan(boolean jeRedovan) {
		this.jeRedovan = jeRedovan;
	}
	
}
