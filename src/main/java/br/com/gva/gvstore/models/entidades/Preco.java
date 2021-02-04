package br.com.gva.gvstore.models.entidades;

public abstract class Preco {

	private Double precoCompra;
	private Double precoCusto;
	private Double precoVenda;
	private Double margemLucro;
	private Double imposto1;
	private Double imposto2;
	private Double imposto3;
	
	public Preco() {}
	
	public Preco(Double precoCompra, Double precoCusto, Double precoVenda, Double margemLucro, Double imposto1,
			Double imposto2, Double imposto3) {
		super();
		this.precoCompra = precoCompra;
		this.precoCusto = precoCusto;
		this.precoVenda = precoVenda;
		this.margemLucro = margemLucro;
		this.imposto1 = imposto1;
		this.imposto2 = imposto2;
		this.imposto3 = imposto3;
	}

	public Double getPrecoCompa() {
		return precoCompra;
	}

	public void setPrecoCompa(Double precoCompra) {
		this.precoCompra = precoCompra;
	}

	public Double getPrecoCusto() {
		return precoCusto;
	}

	public void setPrecoCusto(Double precoCusto) {
		this.precoCusto = precoCusto;
	}

	public Double getPrecoVenda() {
		return precoVenda;
	}

	public void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}

	public Double getMargemLucro() {
		return margemLucro;
	}

	public void setMargemLucro(Double margemLucro) {
		this.margemLucro = margemLucro;
	}

	public Double getImposto1() {
		return imposto1;
	}

	public void setImposto1(Double imposto1) {
		this.imposto1 = imposto1;
	}

	public Double getImposto2() {
		return imposto2;
	}

	public void setImposto2(Double imposto2) {
		this.imposto2 = imposto2;
	}

	public Double getImposto3() {
		return imposto3;
	}

	public void setImposto3(Double imposto3) {
		this.imposto3 = imposto3;
	}
	
	public double calculaPreco() {
		double precoVenda = precoCompra + (precoCompra * margemLucro) + (precoCompra * imposto1) + (precoCompra * imposto2) + (precoCompra * imposto3);   
		return precoVenda; 
	}
	
}
