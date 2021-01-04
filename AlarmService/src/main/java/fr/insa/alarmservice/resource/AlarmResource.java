package fr.insa.alarmservice.resource;

import fr.insa.alarmservice.model.Alarm;
import fr.insa.alarmservice.model.Mapper;
import org.eclipse.om2m.commons.obix.Bool;
import org.eclipse.om2m.commons.obix.Obj;
import org.eclipse.om2m.commons.obix.io.ObixDecoder;
import org.eclipse.om2m.commons.resource.ContentInstance;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
//@RequestMapping("/om2m")

public class AlarmResource {

    private Alarm alarm = new Alarm();

    @PostMapping(value = "/alarm/{duration}")
    public String setAlarm(@PathVariable int duration){
        alarm.setStatus(true);
        Alarm.historyDatabase.add(Alarm.historyDatabase.size(),new Date() + " Alarm " + alarm.getId() + " TRIGGERED for " + duration + " minutes");
        return "Alarm triggered for " + duration + " minutes";
    }

    @GetMapping(value = "/alarm/history")
    @CrossOrigin(origins = "http://localhost:3000")
    public String getHistory(){
        int i = 0;
        JSONArray history = new JSONArray();
        for (String entry : Alarm.historyDatabase){
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

    //@GetMapping(value="/alarm/{alarm_id}", produces= MediaType.APPLICATION_JSON_VALUE)
    /*public String getAlarmState(@PathVariable("alarm_id") String alarmId) throws JsonMappingException, JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-M2M-ORIGIN", "admin:admin");
            //il faudra mettre le header accept avec la valeur “application/xml” pour faire le mapping depuis le string vers une ressource oneM2M;
        headers.set("Accept", "application/xml");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        String resourceUrl = "http://localhost:8282/~/mn-cse/mn-name/"+alarmId+"/DATA/ol";
        ResponseEntity respEntity = restTemplate.exchange(resourceUrl, HttpMethod.GET, entity, String.class);
        String resp = (String) respEntity.getBody();
        System.out.println(resp);

        Mapper mapper = new Mapper();
        //Convert from cin XML String to Cin object

        ContentInstance cin = (ContentInstance) mapper.unmarshal(resp);

        //Convert the obix XML string (content of a cin object) to an object
        Obj obj = ObixDecoder.fromString(cin.getContent());
            //Get the fourth object which corresponds to <bool val =”false” name=”state”>. The object index depends on your implementation.
        Bool obj1 = (Bool) obj.getObjGroup().get(3);
        System.out.println(obj1.getVal());
        //The method returns the representation of cin
        return resp;
    }*/

}