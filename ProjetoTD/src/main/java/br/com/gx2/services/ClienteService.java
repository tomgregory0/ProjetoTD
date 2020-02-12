package br.com.gx2.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gx2.repositories.ClienteRepository;

@Service
public class ClienteService  {
	
	@Autowired
	private ClienteRepository repository; 
	
	
	public ClienteService(ClienteRepository repository) {
		super();
		this.repository = repository;
	}
	
	
	
	
	
	
}
