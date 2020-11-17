package fr.insa.AlarmService.PresenceManagement.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresenceRessource {

	@GetMapping("/presence")
	public boolean presenceStatus(){
		return true;
	}
}
