package fr.insa.heaterservice;

import java.util.ArrayList;

public class Heater {

	public static ArrayList<Heater> heaters = new ArrayList<>();

	private int id;
	private String room;
	private boolean status;

	
	public Heater(String roomName){
		this.setStatus(false);
		heaters.add(this);
		this.setId(heaters.indexOf(this));
		this.setRoom(roomName);
	}
	
	public int getId (){
		return id;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public String getRoom(){
		return room;
	}
	
	public void setRoom(String room) {
		this.room = room;
	}
	
}
