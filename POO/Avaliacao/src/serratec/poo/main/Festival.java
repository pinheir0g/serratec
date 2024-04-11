package serratec.poo.main;

import java.time.LocalDate;
import java.time.LocalTime;
import serratec.poo.classes.Banda;
import serratec.poo.classes.Cantor;
import serratec.poo.classes.DJ;
import serratec.poo.classes.Genero;
import serratec.poo.classes.Show;
import serratec.poo.classes.Palco;

public class Festival {
	public static void main(String[] args) {
		
		Banda banda1 = new Banda("Red Hot Chili Papers", Genero.ROCK, 1000, 4);
		Banda banda2 = new Banda("Alice in Chains", Genero.ROCK, 1000, 4);
		Cantor cantor1 = new Cantor("Pepe", Genero.FUNK, 50.0, "Ukulele");
		Cantor cantor2 = new Cantor("Nenem", Genero.FUNK, 50.0, "Som do Coração");
		DJ dj1 = new DJ("Aloka", Genero.REGGAE, 100);
		
		Show show1 = new Show(LocalDate.of(2024, 6, 20), LocalTime.of(22, 00), dj1);
		Show show2 = new Show(LocalDate.of(2024, 6, 20), LocalTime.of(23, 00), cantor1);
		Show show3 = new Show(LocalDate.of(2024, 6, 20), LocalTime.of(01, 00), banda1);
		Show show4 = new Show(LocalDate.of(2024, 6, 20), LocalTime.of(02, 30), banda2);
		Show show5 = new Show(LocalDate.of(2024, 6, 20), LocalTime.of(03, 30), cantor2);
		
		Palco palco1 = new Palco("Mundo", 100000);
		
		palco1.adicionarShow(show1);
		palco1.adicionarShow(show2);
		palco1.adicionarShow(show3);
		palco1.adicionarShow(show4);
		palco1.adicionarShow(show5);
		
		System.out.println(palco1);
		palco1.getShows();
	}
}
