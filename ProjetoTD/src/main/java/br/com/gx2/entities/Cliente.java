package br.com.gx2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name = "Cliente")

public class Cliente {

	@Id
	@Column(name = "codigoCliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoCliente;

	@Column(name = "nomeCliente")
	private String nomeCliente;

	@Email(message = "VEI tu errou")
	@Column(name = "emailCliente")
	private String emailCliente;

	@Column(name = "senhaCliente")
	private String senhaCliente;

	public Cliente() {
		super();
	}

	public Cliente(Long codigoCliente, String nomeCliente, @Email(message = "VEI tu errou") String emailCliente,
			String senhaCliente) {
		super();
		this.codigoCliente = codigoCliente;
		this.nomeCliente = nomeCliente;
		this.emailCliente = emailCliente;
		this.senhaCliente = senhaCliente;
	}

	public Long getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(Long codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

	public String getSenhaCliente() {
		return senhaCliente;
	}

	public void setSenhaCliente(String senhaCliente) {
		this.senhaCliente = senhaCliente;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigoCliente == null) ? 0 : codigoCliente.hashCode());
		result = prime * result + ((emailCliente == null) ? 0 : emailCliente.hashCode());
		result = prime * result + ((nomeCliente == null) ? 0 : nomeCliente.hashCode());
		result = prime * result + ((senhaCliente == null) ? 0 : senhaCliente.hashCode());
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
		Cliente other = (Cliente) obj;
		if (codigoCliente == null) {
			if (other.codigoCliente != null)
				return false;
		} else if (!codigoCliente.equals(other.codigoCliente))
			return false;
		if (emailCliente == null) {
			if (other.emailCliente != null)
				return false;
		} else if (!emailCliente.equals(other.emailCliente))
			return false;
		if (nomeCliente == null) {
			if (other.nomeCliente != null)
				return false;
		} else if (!nomeCliente.equals(other.nomeCliente))
			return false;
		if (senhaCliente == null) {
			if (other.senhaCliente != null)
				return false;
		} else if (!senhaCliente.equals(other.senhaCliente))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", nomeCliente=" + nomeCliente + ", emailCliente="
				+ emailCliente + ", senhaCliente=" + senhaCliente + "]";
	}

}
