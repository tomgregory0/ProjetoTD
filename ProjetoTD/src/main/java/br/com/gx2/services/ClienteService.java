package br.com.gx2.services;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.gx2.entities.Login;

@Service
public class ClienteService {

	//pegar login da pagina/front
	@RequestMapping (value = "/login", method = RequestMethod.GET)
	public String getLogin() {
		
		return "login";		
	}
	
	@RequestMapping(value ="/login", method=RequestMethod.POST)
	public String login(@ModelAttribute(name="loginForm") Login login, Model model) {
		
		String username = login.
	}

}
