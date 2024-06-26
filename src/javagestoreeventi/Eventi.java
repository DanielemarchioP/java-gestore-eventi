package javagestoreeventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Eventi {
	
	private String titolo;
	protected LocalDate data;
	private int postiTotali;
	private int postiPrenotati;
	
	public Eventi( String titolo, LocalDate data, int postiTotali) {
		
			this.titolo = titolo;
			this.data = data;
			this.postiTotali = postiTotali;
			this.postiPrenotati = 0;
			if(postiTotali > 0 && data.isAfter(LocalDate.now())) {
				System.out.println("quante prenotazioni vuoi effettuare?");
		} else {
			System.out.print("Errore nella selezione del giorno o posti non disponibili");
		}
		
	}
	
//	public void prenota(){
//	if(data.isAfter(LocalDate.now()) && postiTotali > postiPrenotati {
//		postiPrenotati ++;
//		
//		System.out.println(" i posti prenotati sono " + postiPrenotati + "i posti totali per l'evento sono "+ postiTotali");
//		
//	}else {
//		System.out.print("non e possibile prenotare per l'evento scelto");
//	}
	
//	public void disdici() {
//		if(data.isAfter(LocalDate.now()) && postiPrenotati != 0){
//			postiPrenotati --;
//		} else {
//			System.out.println("non e possibile disdire per l'evento scelto");
//		}
//	}
	
	public void prenota() {
		
		System.out.print("Quante prenotazioni vuoi effettuare?");
		Scanner s = new Scanner(System.in);
		int numeroPrenotazioni = s.nextInt();
		if(data.isAfter(LocalDate.now()) && postiTotali > (postiPrenotati + numeroPrenotazioni)) {
			postiPrenotati = postiPrenotati + numeroPrenotazioni;
			
			System.out.print(" i posti prenotati sono " + " " + postiPrenotati + "i posti totali per l'evento sono "+ " " + postiTotali + "hai effettuato " + " " + numeroPrenotazioni + " prenotazioni");
			
		}else {
			System.out.print("non e possibile prenotare per l'evento scelto");
		}
		
		
		
		
	}
	public void disdici() {
			
			System.out.println("Quante disdette vuoi effettuare?");
			Scanner s = new Scanner(System.in);
			int numeroDisdette = s.nextInt();
			if(data.isAfter(LocalDate.now()) && postiPrenotati >= numeroDisdette ) {
			postiPrenotati = postiPrenotati - numeroDisdette;
			System.out.print(" i posti prenotati sono " + postiPrenotati + "i posti totali per l'evento sono "+ postiTotali + "hai effettuato " + numeroDisdette + "  disdette");
			
				}else {
			System.out.print("non e possibile disdire per l'evento scelto, controllare la data e il numero di prenotazioni a suo carico");
			}
			
		}
	

	@Override
	public String toString() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		
		return dtf.format(data) + titolo ;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public int getPostiTotali() {
		return postiTotali;
	}

	public int getPostiPrenotati() {
		return postiPrenotati;
	}
	
	
}

