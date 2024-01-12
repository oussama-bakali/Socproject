package com.example.demo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Incident;
import com.example.demo.repo.IncidentRepository;
@Service
public class IncidentService {
@Autowired
private  IncidentRepository incidentRepo;
public ResponseEntity<String> addIncident(Incident i){
	this.incidentRepo.save(i);
	return new ResponseEntity<>("{\"message\":\"incident added\"}",HttpStatus.OK);
}
public Optional<Incident> getIncidentById(int id) {
    return incidentRepo.findById((long)id);
}
}
