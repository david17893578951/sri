package SRI.SRI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import SRI.SRI.model.FdiPersona;
import SRI.SRI.repository.PersonaRepo;


@RestController
@RequestMapping("/persona")
@CrossOrigin(origins = "*", allowCredentials = "true", allowedHeaders = "*")
public class PersonaController {

	@Autowired
	private PersonaRepo repositorioPersona;

	@RequestMapping(value = "/{cedula}", method = RequestMethod.GET)
	public List<FdiPersona> getPersonabyCedula(@PathVariable("cedula") String cedula) {
		return this.repositorioPersona.getPersonabyCedula(cedula);
	}

}
