package jeden;

public class People implements Comparable<People> {
	private String imie, nazwisko;
	private int wiek;
	
	
	public People(String imie , String nazwisko, int wiek){
		this.imie = imie;
		this.nazwisko = nazwisko;
		this.wiek = wiek;
	}
	
	
	public String getImie(){
		return this.imie;
	}
	
	
	public String toString(){
		return "imie: " + imie + ", nazwisko: " + nazwisko + ", wiek: " + wiek;
	}


	@Override
	public int compareTo(People o) {
		
		return imie.compareTo(o.getImie());
	}
	
	
	
}
