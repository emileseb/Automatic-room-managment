package fr.insa.PresenceManagement;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PresenceRessource {

    @GetMapping("/presence")
    public String presenceStatus() {
        return "{\"presence\": true}";
    }
}
