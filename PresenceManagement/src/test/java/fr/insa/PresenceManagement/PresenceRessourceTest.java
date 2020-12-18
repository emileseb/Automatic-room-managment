package fr.insa.PresenceManagement;

import org.json.JSONException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import org.json.JSONObject;

class PresenceRessourceTest {

    @Test
    void presenceStatus() {
        PresenceRessource presRessource = new PresenceRessource();
        JSONObject resp = null;
        try {
            resp = new JSONObject(presRessource.presenceStatus());
        } catch (JSONException e) {
            fail("Could not convert presence service response to JSON.");
        }
        try {
            resp.getBoolean("presence");
        } catch (JSONException e) {
            fail("The presence object in the replay is not a boolean.");
        }

    }
}