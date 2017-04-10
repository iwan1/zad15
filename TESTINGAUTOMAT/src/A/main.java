package A;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main {
	
	public <T> void wypisz(ArrayList<T> a){
		//System.out.println(a);
		for(int i = 0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
	}

	public static void main(String[] args) {
		main hehe = new main();
		Test jeden;
		String imie,nazwisko;
		int pesel;
		
		ArrayList<Test> lista = new ArrayList();
		
		
		Scanner read = new Scanner(System.in);					//Wczytywanie z pliku
		System.out.println("Imie uzytkownika:");
		imie = read.nextLine();
		System.out.println("Nazwisko uzytkownika:");
		nazwisko = read.nextLine();
		System.out.println("Pesel uzytkownika:");
		pesel = read.nextInt();
		
		lista.add(new Test(imie,nazwisko,pesel));
		lista.add(new Test());
		lista.add(new Test("Bogdan", "£¥ÆKI", 1234));
		
//		for(Test a: lista){
//			a.wypisz();
//		}
		
		hehe.wypisz(lista);
		Integer[] pom = new Integer[]{1,2,3,4,5,6,7,8,9};
		ArrayList<Integer> liczby = new ArrayList<>();
		liczby.addAll(Arrays.asList(pom));
		//liczby.add(1);
		hehe.wypisz(liczby);
		
	}

}
