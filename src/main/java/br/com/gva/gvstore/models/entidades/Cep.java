package br.com.gva.gvstore.models.entidades;

import java.io.Serializable;

public class Cep implements Serializable{
	
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private int cep;
	
	public Cep() {
	}
	
	public Cep(int cep) {
		super();
		this.cep = cep;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cep;
		result = prime * result + id;
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
		Cep other = (Cep) obj;
		if (cep != other.cep)
			return false;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
}
