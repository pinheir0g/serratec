package serratec.poo.classes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Show {

    private LocalDate data;
    private LocalTime hora;
    private Artista artista;

    public Show(LocalDate data, LocalTime hora, Artista artista) {
        this.data = data;
        this.hora = hora;
        this.artista = artista;
    }

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}

	public Artista getArtista() {
		return artista;
	}

	public void setArtista(Artista artista) {
		this.artista = artista;
	}

	@Override
	public String toString() {
		String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		return String.format("""
						Artista: %s
						Data: %s
						Hora: %s
						""",
						artista, dataFormatada, hora);
	}
}