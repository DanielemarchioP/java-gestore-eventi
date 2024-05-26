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
		
		System.out.print(titolo + dt.toString() + postiTotali);
		
		
		Eventi apex = new Eventi(titolo,dt,postiTotali);
		
		System.out.print("Quante prenotazioni vuoi effettuare?");
		int numeroPrenotazioni = s.nextInt();
		
		apex.prenota(numeroPrenotazioni);
			
		
		
		Concerto Marracash = new Concerto(titolo, dt, postiTotali, LocalTime.of(21,00,00), 50.00f );
		
		System.out.println(Marracash.toString());
	}

}
