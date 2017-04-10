package jeden;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;



public class main {
	
	public <T> void wypisz(List<T> a){
		for(int i = 0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
	}
	
	
	
	
	public static void main(String[] args) {
		List<People> lista = new ArrayList<>();
		lista.add(new People("Maciej", "Iwanski", 24));
		lista.add(new People("Franek", "Zgieł", 10));
		lista.add(new People("Lepold", "Szow", 23));
		lista.add(new People("Gibon", "Andrutkiewicz", 42));
		lista.add(new People("Andrzej", "Duda", 1));
		lista.add(new People("Lech", "Pawlak", 84));
		lista.add(new People("Beata", "Szydło", 100));
		
		
		main nowe = new main();
		
		System.out.println("Przed sortowaniem:");
		nowe.wypisz(lista);
		System.out.println("Po sortowaniu:");
		Collections.sort(lista);
		nowe.wypisz(lista);
		
	}
}
