package fr.insa.thermometerservice.resource;

import fr.insa.thermometerservice.model.Thermometer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.Date;

@RestController
public class ThermometerResource {
    private final Thermometer indoorThermometer = new Thermometer("indoor");
    private final Thermometer outdoorThermometer = new Thermometer("outdoor");

    @GetMapping(value = "/thermometer/{room}")
    public String getTemp(@PathVariable String room){
        Thermometer t = Thermometer.findByRoom(room);
        if (t==null) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Existing Room");
        Thermometer.historyDatabase.add(new Date() + " Thermometer " + room + " is " + t.getTemperature() +" °C");
        return "{ \"temperature\" : " + t.getTemperature() + " }";
    }

    @GetMapping(value = "/thermometer/history")
    @CrossOrigin(origins = "http://localhost:3000")
    public String getHistory(){
        int i = 0;
        JSONArray history = new JSONArray();
        for (String entry : Thermometer.historyDatabase){
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
