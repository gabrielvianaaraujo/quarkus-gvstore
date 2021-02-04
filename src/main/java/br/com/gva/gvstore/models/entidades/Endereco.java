package br.com.gva.gvstore.models.entidades;

import java.io.Serializable;

public class Endereco implements Serializable{
		
	private static final long serialVersionUID = 1L;
	
	private String tipo;
	private String endereco;
	private String numero;
	private String complemento;
	private String bairro;
	private Cep cep;
	private Cidade cidade; 
	private Uf uf;
	
	
	public Endereco() {
	
	}
	
	
	public Endereco(String tipo, String endereco, String numero, String complemento, String bairro, Cep cep,
			Cidade cidade, Uf uf) {
		this.tipo = tipo;
		this.endereco = endereco;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}

	
	public Cep getCep() {
		return cep;
	}


	public void setCep(Cep cep) {
		this.cep = cep;
	}


	public String getBairro() {
		return bairro;
	}


	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	public Cidade getCidade() {
		return cidade;
	}


	public void setCidade(Cidade cidade) {
		this.cidade = cidade;
	}


	public Uf getUf() {
		return uf;
	}


	public void setUf(Uf uf) {
		this.uf = uf;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bairro == null) ? 0 : bairro.hashCode());
		result = prime * result + ((cep == null) ? 0 : cep.hashCode());
		result = prime * result + ((endereco == null) ? 0 : endereco.hashCode());
		result = prime * result + ((numero == null) ? 0 : numero.hashCode());
		result = prime * result + ((tipo == null) ? 0 : tipo.hashCode());
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
		Endereco other = (Endereco) obj;
		if (bairro == null) {
			if (other.bairro != null)
				return false;
		} else if (!bairro.equals(other.bairro))
			return false;
		if (cep == null) {
			if (other.cep != null)
				return false;
		} else if (!cep.equals(other.cep))
			return false;
		if (endereco == null) {
			if (other.endereco != null)
				return false;
		} else if (!endereco.equals(other.endereco))
			return false;
		if (numero == null) {
			if (other.numero != null)
				return false;
		} else if (!numero.equals(other.numero))
			return false;
		if (tipo == null) {
			if (other.tipo != null)
				return false;
		} else if (!tipo.equals(other.tipo))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Endereco [tipo=" + tipo + ", endereco=" + endereco + ", numero=" + numero + ", complemento="
				+ complemento + ", bairro=" + bairro + ", cep=" + cep + ", cidade=" + cidade + ", uf=" + uf + "]";
	}
	
	
	
	
}
