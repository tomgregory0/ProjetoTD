package br.com.gx2.resources;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.gx2.entities.Login;
@Resource
public class ClienteResources {

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
