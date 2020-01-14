package br.com.gft.model;

import br.com.gft.interfaces.Imposto;

public class Videogame extends Produto implements Imposto{

	public Videogame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		super(nome, preco, qtd);
this.marca = marca;
this.modelo = modelo;
this.isUsado = isUsado;

	}

	private String marca;
	private String modelo;
	private boolean isUsado;
	
	public void videogame () {
		
	}
	
	public void videogame (String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	public double calculaImposto() {
		if (isUsado == true) {
			String use = "usado";
			System.out.println("O " +getNome()+" "+modelo+" "+use + " tem imposto igual a R$ " +0.25*getPreco());
			return 0;
		} else {
			System.out.println("O " +getNome()+" "+modelo+" tem imposto igual a R$ " +0.45*getPreco()); 
			return 0;
		}
	}
	
}
