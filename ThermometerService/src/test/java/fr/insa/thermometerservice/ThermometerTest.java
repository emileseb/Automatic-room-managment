package fr.insa.thermometerservice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ThermometerTest {

    @Test
    void getRoom() {
        Thermometer therm = new Thermometer("indoor1");
        assertEquals("indoor1", therm.getRoom());
    }

    @Test
    void setRoom() {
        Thermometer therm = new Thermometer("indoor2");
        therm.setRoom("outdoor2");
        assertEquals("outdoor2", therm.getRoom());
    }

    @Test
    void getTemperature() {
        Thermometer therm = new Thermometer("indoor3");
        int temp = therm.getTemperature();
        assertTrue(0 <=temp && temp <= 30);
    }

    @Test
    void setTemperature() {
        Thermometer therm = new Thermometer("indoor3");
        therm.setTemperature(25);
        assertEquals(25, therm.getTemperature());
    }

    @Test
    void findByRoom() {
        Thermometer therm = new Thermometer("indoor4");
        Thermometer therm2 = new Thermometer("indoor5");
        Thermometer therm3 = new Thermometer("outdoor6");
        assertEquals("outdoor6", Thermometer.findByRoom("outdoor6").getRoom());
    }

    @Test
    void removeThermometer() {
        Thermometer therm = new Thermometer("indoor7");
        Thermometer.removeThermometer(therm);
        assertNull(Thermometer.findByRoom("indoor7"));
    }
}