package serratec.poo.classes;

import java.util.ArrayList;
import java.util.List;

public class Palco {

    private String nome;
    private int capacidade;
    private List<Show> shows = new ArrayList<>();

    public Palco(String nome, int capacidade) {
        this.nome = nome;
        this.capacidade = capacidade;
    }

    public void adicionarShow(Show show) {
        this.shows.add(show);
    }

    public void getArtistas() {
        List<Artista> artistas = new ArrayList<>();
        for (Show show : shows) {
            artistas.add(show.getArtista());
        }
        for(Artista artista: artistas) {
        	System.out.println("Artista: " + artista.getNome() + " - " + " Gênero: " + artista.getGenero());
        }
    }
   
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void getShows() {
        for (Show show : shows) {
        	System.out.println(show);
        }
    }
    
    public String toString() {
    	return "Nome: " + nome +
    			"\nCapacidade: " + capacidade + "\n" + "Shows: \n";
    			
    }
}