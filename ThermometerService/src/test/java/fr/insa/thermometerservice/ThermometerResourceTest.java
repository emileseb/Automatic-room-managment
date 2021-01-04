package fr.insa.thermometerservice;

import fr.insa.thermometerservice.resource.ThermometerResource;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.matchesPattern;


class ThermometerResourceTest {

    @Test
    void getTemp() {
        ThermometerResource therm = new ThermometerResource();
        String rep = therm.getTemp("indoor");
        assertThat(rep, matchesPattern("\\{ \"temperature\" : [0-9]{1,2} }"));
    }
}