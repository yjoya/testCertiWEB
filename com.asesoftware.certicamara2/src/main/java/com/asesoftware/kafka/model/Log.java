package com.asesoftware.kafka.model;

public class Log {
	
	
	private int id;
	private String service;
	private String name;
	private String lastname;
	private String date;
	
	public Log(){
	}
	
	public Log(String id,String service,String name,String lastname,String date){
		this.name = id;
		this.name = service;
		this.name = name;
		this.name = lastname;
		this.name = date;
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getService() {
		return service;
	}

	public void setService(String service) {
		this.service = service;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String toString(){
		String info = String.format("{ 'id': %d, 'service': %1$s,'name': %2$s,'lastname': %3$s,'date': %4$s}", id,service,name,lastname,date);
		return info;
	}
}