package fr.insa.thermometerservice.resource;

import fr.insa.thermometerservice.model.Thermometer;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

@RestController
public class ThermometerResource {
    private final Thermometer indoorThermometer = new Thermometer("indoor");
    private final Thermometer outdoorThermometer = new Thermometer("outdoor");

    @GetMapping(value = "/thermometer/{room}")
    public String getTemp(@PathVariable String room){
        Thermometer t = Thermometer.findByRoom(room);
        if (t==null) throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Not Existing Room");
        return "{ \"temperature\" : " + t.getTemperature() + " }";
    }
}
