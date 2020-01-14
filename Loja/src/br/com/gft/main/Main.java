package br.com.gft.main;

import java.util.ArrayList;
import java.util.List;

import br.com.gft.model.Livro;
import br.com.gft.model.Loja;
import br.com.gft.model.Videogame;

public class Main {
public static void main(String[] args) {
	Livro l1 = new Livro("Harry Potter", 40.0, 50, "J. K. Rownling", "fantasia", 300);
	Livro l2 = new Livro("O Senhor dos Aneis", 60.0, 30, "J. R. R. Tolkien", "fantasia", 500);
	Livro l3 = new Livro("Java POO", 20.0, 50, "GFT", "educativo", 500);
	
	Videogame ps4 = new Videogame("PS4", 1800, 100, "Sony", "Slim", false);
	Videogame ps4Usado = new Videogame("PS4", 1000, 7, "Sony", "Slim", true);
	Videogame xbox = new Videogame("XBOX", 1500, 500, "Microsoft", "One", false);
	
	List<Livro> livros = new ArrayList<>();
	livros.add(l1);
	livros.add(l2);
	livros.add(l3);
		
	List<Videogame> games = new ArrayList<>();
	games.add(ps4);
	games.add(ps4Usado);
	games.add(xbox);
		
	Loja americanas = new Loja ("Americanas", "12345678", livros, games);
	
	l1.calculaImposto();
	l2.calculaImposto();
	l3.calculaImposto();
	
	ps4.calculaImposto();
	ps4Usado.calculaImposto();
	xbox.calculaImposto();
	System.out.println("---------------------------------------------------------------------------");
	
	americanas.listaLivros();
	americanas.listaVideogames();
	americanas.calculaPatrimonio();	
	
	
}
}
