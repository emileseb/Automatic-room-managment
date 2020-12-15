package fr.insa.alarmresource;

import fr.insa.alarmmodel.Alarm;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import fr.insa.alarmmodel.Mapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;

import org.eclipse.om2m.commons.resource.ContentInstance;
import org.eclipse.om2m.commons.obix.Bool;
import org.eclipse.om2m.commons.obix.io.ObixDecoder;
import org.eclipse.om2m.commons.obix.io.ObixEncoder;
import org.eclipse.om2m.commons.obix.io.ObixMapper;
import org.eclipse.om2m.commons.obix.Obj;


@RestController
@RequestMapping("/om2m")

public class AlarmResource {

    private Alarm alarm = new Alarm();
/*
    @PostMapping(value = "/alarm/{id}")
    public String setAlarm(@PathVariable int id){
        alarm.setStatus(true);
        return "Alarm triggered for " + id + " minutes";
    }
}
*/
    @GetMapping(value="/lamps/{lamp_id}", produces= MediaType.APPLICATION_JSON_VALUE)
    public String getLampState(@PathVariable("lamp_id") String lampId) throws JsonMappingException, JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.set("X-M2M-ORIGIN", "admin:admin");
            //il faudra mettre le header accept avec la valeur “application/xml” pour faire le mapping depuis le string vers une ressource oneM2M;
        headers.set("Accept", "application/xml");
        HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
        String resourceUrl = "http://localhost:8282/~/mn-cse/mn-name/"+lampId+"/DATA/ol";
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
    }

}