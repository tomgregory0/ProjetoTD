package br.com.gx2.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gx2.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

	boolean existsByEmail(String emailCliente);
	Optional<Cliente> findByEmail(String emailCliente);
	
	boolean existsByPassword(String senhaCliente);
	Optional<Cliente> findByPassword(String senhaCliente);

	

}
