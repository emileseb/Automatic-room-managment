package fr.insa.alarmservice;

//import com.sun.istack.internal.Nullable;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class AlarmServiceApplicationTests {

    private final String alarmAPIEndpoint = "http://localhost:8001/alarm/1";
    private RestTemplate restTemplate;

    /*@Autowired
    AlarmResource alarm;

    @Test
    void contextLoads() {
        assertThat(alarm).isNotNull();
    }

    @Test
    void contactAlarm(){
        assertThat(alarm.setAlarm(5).contains("Alarm triggered for " + 5 + " minutes"));
    }

    /*@Test
    public void triggerAlarm() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>("1", headers);
        assertThat(restTemplate.exchange(this.alarmAPIEndpoint, HttpMethod.POST, entity, String.class).getStatusCodeValue() >= 200);
    }*/

}
