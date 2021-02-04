package br.com.gva.gvstore.models.entidades;

import java.io.Serializable;
import java.util.List;

public abstract class Empresa implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Integer codigo;
	private String razaoSocial;
	private String nomeFantasia;
	private String cnpj;
	private String inscMunicipal;
	private String inscEstadual;
	private String telefone;
	private String celular;
	private String email;
	private String site;
	private List<Produto> listaDeProdutos; 
	private String obervacoes;
	private Endereco endereço;
	
	public Empresa() {}

	public Empresa(Integer codigo, String razaoSocial, String nomeFantasia, String cnpj, String inscMunicipal,
			String inscEstadual, String telefone, String celular, String email, String site,
			List<Produto> listaDeProdutos, String obervacoes, Endereco endereço) {
		super();
		this.codigo = codigo;
		this.razaoSocial = razaoSocial;
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
		this.inscMunicipal = inscMunicipal;
		this.inscEstadual = inscEstadual;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.site = site;
		this.listaDeProdutos = listaDeProdutos;
		this.obervacoes = obervacoes;
		this.endereço = endereço;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	public String getNomeFantasia() {
		return nomeFantasia;
	}

	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getInscMunicipal() {
		return inscMunicipal;
	}

	public void setInscMunicipal(String inscMunicipal) {
		this.inscMunicipal = inscMunicipal;
	}

	public String getInscEstadual() {
		return inscEstadual;
	}

	public void setInscEstadual(String inscEstadual) {
		this.inscEstadual = inscEstadual;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public List<Produto> getListaDeProdutos() {
		return listaDeProdutos;
	}

	public void setListaDeProdutos(List<Produto> listaDeProdutos) {
		this.listaDeProdutos = listaDeProdutos;
	}

	public String getObervacoes() {
		return obervacoes;
	}

	public void setObervacoes(String obervacoes) {
		this.obervacoes = obervacoes;
	}

	public Endereco getEndereço() {
		return endereço;
	}

	public void setEndereço(Endereco endereço) {
		this.endereço = endereço;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cnpj == null) ? 0 : cnpj.hashCode());
		result = prime * result + ((razaoSocial == null) ? 0 : razaoSocial.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Empresa other = (Empresa) obj;
		if (cnpj == null) {
			if (other.cnpj != null)
				return false;
		} else if (!cnpj.equals(other.cnpj))
			return false;
		if (razaoSocial == null) {
			if (other.razaoSocial != null)
				return false;
		} else if (!razaoSocial.equals(other.razaoSocial))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Empresa [codigo=" + codigo + ", razaoSocial=" + razaoSocial + ", nomeFantasia=" + nomeFantasia
				+ ", cnpj=" + cnpj + ", inscMunicipal=" + inscMunicipal + ", inscEstadual=" + inscEstadual
				+ ", telefone=" + telefone + ", celular=" + celular + ", email=" + email + ", site=" + site
				+ ", obervacoes=" + obervacoes + ", endereço=" + endereço + "]";
	}

	
	
	
}
