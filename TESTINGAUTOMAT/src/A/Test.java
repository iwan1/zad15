package A;

public class Test {
	//Pola
	private String imie, nazwisko;
	private int pesel;
	
	//Konstruktory
	public Test(){
		imie="Maciej";
		nazwisko="Iwanski";
		pesel=12345;
	}
	
	public Test(String imie, String nazwisko, int pesel){
		this.imie=imie;
		this.nazwisko=nazwisko;
		this.pesel=pesel;
	}
	
	
	//Metody
	public void wypisz(){
		System.out.println("Imie: " + imie);
		System.out.println("Nazwisko: "  + nazwisko);
		System.out.println("Pesel: " + pesel);
	}
	
	public void println(){
		System.out.println("Imie: " + imie);
		System.out.println("Nazwisko: "  + nazwisko);
		System.out.println("Pesel: " + pesel);
	}
	
	public String toString() {
        return "imie: " + imie + ", nazwisko: " + nazwisko + ", pesel: " + pesel;
    }
	
	public void unitTest(){
		
	}
}
