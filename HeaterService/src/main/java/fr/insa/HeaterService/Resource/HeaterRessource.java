package fr.insa.HeaterService.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.insa.HeaterService.model.Heater;

@RestController
public class HeaterRessource {
	
	private final Heater device = new Heater();
	
	@GetMapping(value="/heater/test")
	public String test() {
		return "test OK";
	}

	@PostMapping(value="/heater/{Temperature}")
	public String order(@PathVariable int temperature) {
		device.setStatus(true);
		return "Heat ON : " + temperature + "°C";
	}
	
}
