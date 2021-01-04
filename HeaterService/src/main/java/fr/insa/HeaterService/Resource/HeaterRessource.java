package fr.insa.HeaterService.Resource;

import org.springframework.web.bind.annotation.*;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import fr.insa.HeaterService.model.Heater;

import java.util.Date;

@RestController
public class HeaterRessource {
	
	private final Heater device = new Heater();

	@PostMapping(value="/heater/{temperature}")
	public String order(@PathVariable int temperature) {
		device.setStatus(true);
		Heater.historyDatabase.add(new Date() + " Heater set ON");
		return "Heat ON : " + temperature + "°C";
	}

	@GetMapping(value = "/heater/history")
	@CrossOrigin(origins = "http://localhost:3000")
	public String getHistory(){
		int i = 0;
		JSONArray history = new JSONArray();
		for (String entry : Heater.historyDatabase){
			JSONObject hist_entry = new JSONObject();
			try {
				hist_entry.accumulate("entree", entry);
				history.put(hist_entry);
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		return history.toString();
	}
	
}
