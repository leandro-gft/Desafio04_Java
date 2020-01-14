package br.com.gft.model;

import java.util.List;

public class Loja {

	public Loja(String nome, String cnpj, List<Livro> livros, List<Videogame> videogames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videogames = videogames;
	}

	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<Videogame> videogames;

	public void loja() {

	}

	public void loja(String nome, String cnpj, List<Livro> livros, List<Videogame> videogames) {

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<Videogame> getVideogames() {
		return videogames;
	}

	public void setVideogames(List<Videogame> videogames) {
		this.videogames = videogames;
	}

	public void listaLivros() {
		if (livros.size() == 0) {
			System.out.println("A loja não tem livros no seu estoque.");
		} else {
			System.out.println("A loja " + this.nome + " possui estes livros para venda: ");
			for (Livro livro : livros) {
				System.out.println("Título: " + livro.getNome() + ", preço: " + livro.getPreco()
						+ ", quantidade: " + livro.getQtd() + " em estoque.");
			}
		}
		System.out.println("---------------------------------------------------------------------------");
	}

	public void listaVideogames() {

		if (videogames.size() == 0) {
			System.out.println("A loja não tem videogames no seu estoque.");
		} else {
			System.out.println("A loja " + this.nome + " possui estes videogames para venda: ");

			for (Videogame videogame : videogames) {
				System.out.println("Título: " + videogame.getNome() + ", preço: " + videogame.getPreco()
						+ ", quantidade: " + videogame.getQtd() + " em estoque.");
			}
		}
		System.out.println("---------------------------------------------------------------------------");
	}

	public double calculaPatrimonio() {
		double patrimonio = 0;
		if (livros.size() == 0) {
			System.out.println("A loja não tem livros no seu estoque.");
		} else {
			for (Livro livro : livros) {
				patrimonio = patrimonio + (livro.getPreco() * livro.getQtd());
			}
		}
		if (videogames.size() == 0) {
			System.out.println("A loja não tem videogames no seu estoque.");
		} else {
			for (Videogame videogame : videogames) {
				patrimonio = patrimonio + (videogame.getPreco() * videogame.getQtd());
			}
		}
		System.out.println("O patrimônio da loja " + this.nome + " é de R$ " + patrimonio);
		return 0;
	}
}
