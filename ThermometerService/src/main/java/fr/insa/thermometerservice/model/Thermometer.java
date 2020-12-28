package fr.insa.thermometerservice.model;

import java.util.ArrayList;

public class Thermometer {

    public static ArrayList<Thermometer> thermometerList = new ArrayList<>();
    private String room;
    private int temperature;

    public Thermometer(String room){
        this.setTemperature((int)(Math.random()*30));
        thermometerList.add(this);
        this.room = room;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public static Thermometer findByRoom(String room){
        for (Thermometer t : thermometerList){
            if (t.room.equals(room))
                return t;
        }
        return null;
    }

    public static void removeThermometer(Thermometer thermometer){
        thermometerList.remove(thermometer);
    }
}
