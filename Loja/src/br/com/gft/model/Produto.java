package br.com.gft.model;

public abstract class Produto {
	public Produto(String nome, double preco, int qtd) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.qtd = qtd;
	}

	private String nome;
	private double preco;
	private int qtd;
	
	public void produto() {
		
	}
	
	public void produto(String nome, double preco, int qtd) {
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQtd() {
		return qtd;
	}

	public void setQtd(int qtd) {
		this.qtd = qtd;
	}

}
