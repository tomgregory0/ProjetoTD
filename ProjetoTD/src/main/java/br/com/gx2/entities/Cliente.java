package br.com.gx2.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Cliente")
@ 
public class Cliente {

	@Id
	@Column(name = "codigoCliente")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigoCliente;

	@Column(name = "nomeCliente")
	private String nomeCliente;

	@Column(name = "emailCliente")
	private String emailCliente;

	@Column(name = "senhaCliente")
	private String senhaCliente;

}
