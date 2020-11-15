package fr.insa.automanagement;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class AutomanagementApplication {

    // Alarm API
    private final String alarmAPIEndpoint = "http://localhost:8001/alarm";

    // Presence detector API
    private final String presenceAPIEndpoint = "http://localhost:8002/presence";

    // AutoManagement settings
    public boolean ON = true;
    public boolean IS_CLOSED = false;

    private RestTemplate restTemplate;


    public static void main(String[] args) {
        AutomanagementApplication app = new AutomanagementApplication();
        app.run();
    }


    public void run() {
        restTemplate = new RestTemplate();

        // Continuously scan presence
        while (this.ON) {
            // Check for presence
            if (checkPresence()) {
                // Check if INSA is closed
                if (isClosed()) {
                    // Trigger the alarm
                    triggerAlarm(1);
                }
            }
            try {
                wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public boolean checkPresence() {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<String> entity = new HttpEntity<>(headers);

        String body = restTemplate.exchange(this.presenceAPIEndpoint, HttpMethod.GET, entity, String.class).getBody();

        JSONObject json = null;
        try {
            json = new JSONObject(body);
        } catch (JSONException e) {
            e.printStackTrace();
        }

        try {
            return json.getString("presence").equals("true");
        } catch (JSONException e) {
            e.printStackTrace();
            return false;
        }
    }

    public void triggerAlarm(Integer duration) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        HttpEntity<Integer> entity = new HttpEntity<>(duration, headers);

        System.out.println(
                restTemplate.exchange(this.alarmAPIEndpoint, HttpMethod.POST, entity, String.class).getStatusCode());
    }

    public boolean isClosed() {
        // Everytime switch to CLOSED or OPENED for testing purposes
        this.IS_CLOSED = !this.IS_CLOSED;
        return this.IS_CLOSED;
    }

}
