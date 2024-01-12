package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Notification;
import com.example.demo.services.NotificationService;

@RestController
public class NotificationController {
	@Autowired
	public NotificationService notifiservice;
@PostMapping("/addnotification")
public ResponseEntity<String>Addingnotification(@RequestBody Notification notif){
	this.notifiservice.addnotification(notif);
	return new ResponseEntity("{\"message\":\"notification added\"}",HttpStatus.OK);
}
@GetMapping("/Listnotification")
public List<Notification>getallnotifications(){
	return this.notifiservice.getallnotifications();
}
}
