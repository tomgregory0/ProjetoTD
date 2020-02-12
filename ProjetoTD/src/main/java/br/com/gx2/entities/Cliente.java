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
@Data
public class Cliente {

	@Id
	@Column(name = "codigoCliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoCliente;

	@Column(name = "nomeCliente")
	private String nomeCliente;
	
	@Email (message = "VEI tu errou")
	@Column(name = "emailCliente")
	private String emailCliente;

	@Column(name = "senhaCliente")
	private String senhaCliente;

}
