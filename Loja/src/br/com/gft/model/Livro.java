package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Livro extends Produto implements Imposto {

	public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		super(nome, preco, qtd);
		this.autor = autor;
		this.tema = tema;
		this.qtdPag = qtdPag;
	}
	private String autor;
	private String tema;
	private int qtdPag;
	
	public void livro() {
		
	}
	public void livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
		
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getTema() {
		return tema;
	}
	public void setTema(String tema) {
		this.tema = tema;
	}
	public int getQtdPag() {
		return qtdPag;
	}
	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}
	public double calculaImposto() {
		if (tema == "educativo") {
			System.out.println("N�o h� imposto para o livro " +getNome()+ ", uma vez que seu tema � " +getTema());
			return 0;
		} else {
			System.out.println("O livro " +getNome()+ ", possui imposto igual R$ " +0.1*getPreco()); 
			return 0;
		}
	}
	
}
