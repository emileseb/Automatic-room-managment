package fr.insa.heaterservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
public class HeaterRessource {

	@PostMapping(value="/heater/{id}/on")
	public void setOn(@PathVariable int id) {
		Heater.heaters.get(id).setStatus(true);
	}

	@PostMapping(value="/heater/{id}/off")
	public void setOff(@PathVariable int id) {
		Heater.heaters.get(id).setStatus(false);
	}
	
}
