package fr.insa.alarmservice;

public class Alarm {
    private int id;
    private boolean status;

    public Alarm(int id){
        this.id=id;
    }

    public Alarm(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
