package serratec.poo.classes;

public class Cantor extends Artista {

    private String instrumento;

    public Cantor(String nome, Genero genero, double cache, String instrumento) {
        super(nome, genero, cache);
        this.instrumento = instrumento;
    }

	public String getInstrumento() {
		return instrumento;
	}

	public void setInstrumento(String instrumento) {
		this.instrumento = instrumento;
	}
}