package br.com.gx2.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.gx2.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
