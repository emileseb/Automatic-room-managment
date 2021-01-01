package fr.insa.HeaterService.model;

import java.util.ArrayList;

public class Heater {

	private static ArrayList<Heater> heaterList= new ArrayList<>();
	private int id;
	private String room;
	private boolean status;

	
	public Heater(){
		this.setStatus(false);
		heaterList.add(this);
		this.setId(heaterList.indexOf(this));
		this.setRoom("Salle_1");
	}
	
	public int getId (){
		return id;
	}
	
	public void setId (int id) {
		this.id = id;
	}
	
	public boolean isStatus() {
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
