package serratec.poo.classes;

public class Banda extends Artista {

    private int numeroIntegrantes;

    public Banda(String nome, Genero genero, double cache, int numeroIntegrantes) {
        super(nome, genero, cache);
        this.numeroIntegrantes = numeroIntegrantes;
    }

	public int getNumeroIntegrantes() {
		return numeroIntegrantes;
	}

	public void setNumeroIntegrantes(int numeroIntegrantes) {
		this.numeroIntegrantes = numeroIntegrantes;
	}
}