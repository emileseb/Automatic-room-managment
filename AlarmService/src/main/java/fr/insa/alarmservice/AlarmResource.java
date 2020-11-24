package fr.insa.alarmservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlarmResource {
    private final Alarm alarm = new Alarm();

    @PostMapping(value = "/alarm/{id}")
    public String setAlarm(@PathVariable int id){
        alarm.setStatus(true);
        return "Alarm triggered for " + id + " minutes";
    }
}
