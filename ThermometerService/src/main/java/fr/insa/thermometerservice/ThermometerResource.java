package fr.insa.thermometerservice;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThermometerResource {
    private final Thermometer indoorThermometer = new Thermometer("indoor");
    private final Thermometer outdoorThermometer = new Thermometer("outdoor");

    @GetMapping(value = "/thermometer/{room}")
    public int setAlarm(@PathVariable String room){
        Thermometer t = Thermometer.findByRoom(room);
        if (t==null) return -100;
        return t.getTemperature();
    }
}
