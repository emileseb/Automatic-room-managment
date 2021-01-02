package fr.insa.PresenceManagement;

import org.json.JSONArray;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.Date;

@RestController
public class PresenceRessource {

    public static ArrayList<String> historyDatabase = new ArrayList<>();
    private boolean presence = true;

    @GetMapping("/presence")
    public String presenceStatus() {
        JSONObject resp = new JSONObject();
        try {
            resp.put("presence", this.presence);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        if (presence){
            PresenceRessource.historyDatabase.add(new Date() + " Presence Detected");
        }else{
            PresenceRessource.historyDatabase.add(new Date() + " NO Presence Detected");
        }
        presence = !presence; //For testing purpose
        return resp.toString();
    }

    @GetMapping(value = "/presence/history")
    @CrossOrigin(origins = "http://localhost:3000")
    public String getHistory(){
        int i = 0;
        JSONArray history = new JSONArray();
        for (String entry : PresenceRessource.historyDatabase){
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
