package com.example.demo.entities;



import java.sql.Date;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Incident {
@Id 
private int idaccident;
private String source;
private Date incidentdate;
private LocalTime hour;
private String place;
private String description;
public Incident(int idaccident, String source, Date incidentdate, LocalTime hour, String place, String description) {
	super();
	this.idaccident = idaccident;
	this.source = source;
	this.incidentdate = incidentdate;
	this.hour = hour;
	this.place = place;
	this.description = description;
}
public Incident() {
	super();
	// TODO Auto-generated constructor stub
}
public int getIdaccident() {
	return idaccident;
}
public void setIdaccident(int idaccident) {
	this.idaccident = idaccident;
}
public String getSource() {
	return source;
}
public void setSource(String source) {
	this.source = source;
}
public Date getIncidentdate() {
	return incidentdate;
}
public void setIncidentdate(Date incidentdate) {
	this.incidentdate = incidentdate;
}
public LocalTime getHour() {
	return hour;
}
public void setHour(LocalTime hour) {
	this.hour = hour;
}
public String getPlace() {
	return place;
}
public void setPlace(String place) {
	this.place = place;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}


}
