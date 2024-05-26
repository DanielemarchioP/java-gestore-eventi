package javagestoreeventi;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Eventi {
	
	private String titolo;
	private LocalDate data;
	private int postiTotali;
	private int postiPrenotati;
	
	public Eventi( String titolo, LocalDate data, int postiTotali) {
		if(postiTotali > 0 && data.isAfter(LocalDate.now())) {
			
			this.titolo = titolo;
			this.data = data;
			this.postiTotali = postiTotali;
			this.postiPrenotati = 0;
			
		} else {
			System.out.print("Errore nella selezione del giorno o posti non disponibili");
		}
		
	}
	
	public void prenota(int numeroPrenotazioni) {
		if(data.isAfter(LocalDate.now()) && postiTotali > (postiPrenotati + numeroPrenotazioni)) {
			postiPrenotati = postiPrenotati + numeroPrenotazioni;
			
			System.out.println(" i posti prenotati sono " + postiPrenotati + "i posti totali per l'evento sono "+ postiTotali + "hai effettuato " + numeroPrenotazioni + " prenotazioni");
			
		}else {
			System.out.print("non e possibile prenotare per l'evento scelto");
		}
	}
	public void disdici(int numeroDisdette) {
		if(data.isAfter(LocalDate.now()) && postiPrenotati >= numeroDisdette ) {
			postiPrenotati = postiPrenotati - numeroDisdette;
			System.out.println(" i posti prenotati sono " + postiPrenotati + "i posti totali per l'evento sono "+ postiTotali + "hai effettuato " + numeroDisdette + "  disdette");
			
		}else {
			System.out.print("non e possibile disdire per l'evento scelto");
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

