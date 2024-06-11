package javagestoreeventi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Concerto extends Eventi {
	private LocalTime ora;
	private float prezzo;
	
	public Concerto(String titolo, LocalDate data, int postiTotali, LocalTime ora, float prezzo ) {
		super(titolo, data, postiTotali);
		this.ora = ora;
		this.prezzo = prezzo;
	}

	
	
	
	
	@Override
	public String toString() {
		
		if(data.isAfter(LocalDate.now())){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		return " l'ora del concerto e " + ora.toString() + " si terra in data " + dtf.format(getData()) + "al prezzo di : " + String.format("%.2f",prezzo) + " euro";
		}else {
			return "la data inserita non e valida";
		}
		}







	public LocalTime getOra() {
		return ora;
	}

	public void setOra(LocalTime ora) {
		this.ora = ora;
	}

	public float getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(float prezzo) {
		this.prezzo = prezzo;
	}

	
}
