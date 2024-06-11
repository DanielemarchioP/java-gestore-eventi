package javagestoreeventi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner s = new Scanner(System.in);
		System.out.print("inserisci titolo dell'evento ");
		String titolo = s.nextLine(); 
		System.out.print("inserisci data dell'evento [YYYY-MM-GG] ");
		String d = s.nextLine(); 
		LocalDate dt = LocalDate.parse(d);
		System.out.print("inserisci posti totali dell'evento ");
		int postiTotali = s.nextInt();
		
		System.out.print("il titolo dell'evento scelto e " + titolo + " " + "la data scelta e " + " " + dt.toString() + " " + " i posti totali per l'evento sono" + " " + postiTotali);
		
		
		Eventi apex = new Eventi(titolo,dt,postiTotali);
		
		
		apex.prenota();
		apex.disdici();
		
		
		
//		System.out.println("vuoi effettuare disdette?[ Y/N ]");
//		String confermaDisdetta = s.nextLine();
//		
//		switch (confermaDisdetta) {
//		
//		case "Y":
//			apex.disdici();
//			break;
//		case "N":
//			System.out.println("non verranno effettuate disdette");
//			break;
//		}
		
		
		
		
		Concerto Marracash = new Concerto(titolo, dt, postiTotali, LocalTime.of(21,00,00), 50.00f );
		
		Marracash.prenota();
		
		Marracash.disdici();
		
		System.out.println(Marracash.toString());
	}

}
