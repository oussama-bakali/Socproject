package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Notification;
import com.example.demo.repo.NotificationRepository;
@Service
public class NotificationService {
@Autowired
public NotificationRepository notifrepo;
public List<Notification>getallnotifications(){
	return this.notifrepo.findAll();
}
public void addnotification(Notification n) {
	this.notifrepo.save(n);
}
}
