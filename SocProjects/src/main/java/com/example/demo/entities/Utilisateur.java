package com.example.demo.entities;


import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Utilisateur implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
private int id;
private String nom;
private String email;
private String password;
public int getId() {
	return this.id;
}
public void setId(int id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Utilisateur() {
	super();
	// TODO Auto-generated constructor stub
}
public Utilisateur(int id, String nom, String email, String password) {
	super();
	this.id = id;
	this.nom = nom;
	this.email = email;
	this.password = password;
}
}

