package fr.insa.PresenceManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONException;
import org.json.JSONObject;

@RestController
public class PresenceRessource {

    private boolean presence = true;

    @GetMapping("/presence")
    public String presenceStatus() {
        JSONObject resp = new JSONObject();
        try {
            resp.put("presence", this.presence);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return resp.toString();
    }
}
