package com.example.demo.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Notification {
@Id
private int idnotification;
private String message;
private Date datenotification;
public int getIdnotification() {
	return idnotification;
}
public void setIdnotification(int idnotification) {
	this.idnotification = idnotification;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public Date getDatenotification() {
	return datenotification;
}
public void setDatenotification(Date datenotification) {
	this.datenotification = datenotification;
}
public Notification(int idnotification, String message, Date datenotification) {
	super();
	this.idnotification = idnotification;
	this.message = message;
	this.datenotification = datenotification;
}
public Notification() {
	super();
	// TODO Auto-generated constructor stub
}

}
