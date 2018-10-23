package com.asesoftware.kafka.model;

public class Log {
	
	
	private String id;
	private String service;
	private String name;
	private String lastname;
	private String date;
	
	public Log(){
	}
	
	public Log(String id,String service,String name,String lastname,String date){
		this.id = id;
		this.service = service;
		this.name = name;
		this.lastname = lastname;
		this.date = date;
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
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
		String info = String.format("{ 'id': %1$s, 'service': %2$s,'name': %3$s,'lastname': %4$s,'date': %5$s}", id,service,name,lastname,date);
		
		return info;
	}
}