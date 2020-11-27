package fr.insa.HeaterService.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.HeaterService.Heater;

@RestController
public class HeaterRessource {
	
	private final Heater device = new Heater();
	
	@GetMapping(value="/heater/test")
	public String test() {
		return "test OK";
	}

	@PostMapping(value="/heater/{id}")
	public String order(@PathVariable int id) {
		device.setStatus(true);
		return "Heat ON";
	}
	
}
