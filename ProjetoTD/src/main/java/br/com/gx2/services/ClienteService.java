package br.com.gx2.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsousa.minhasfinancas.exception.ErroAutenticacao;

import br.com.gx2.entities.Cliente;
import br.com.gx2.repositories.ClienteRepository;

@Service
public class ClienteService  {
	
	@Autowired
	private ClienteRepository repository; 
	
	
	public ClienteService(ClienteRepository repository) {
		super();
		this.repository = repository;
	}

	
	public Cliente autenticar(String email,  String senha) {
		Optional<Cliente> cliente = repository.findByEmail(email);

		if(!cliente.isPresent()) {
			throw new ErroAutenticacao("Usuário não encontrado para o email informado.");
		}
		
		if(!usuario.get().getSenha().equals(senha)) {
			throw new ErroAutenticacao("Senha inválida.");
		}

		return usuario.get();
	}
		
	}
	
	
	
	
	
	
}
