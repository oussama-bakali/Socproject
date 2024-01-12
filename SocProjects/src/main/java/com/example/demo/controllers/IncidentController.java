package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Incident;
import com.example.demo.services.IncidentService;

@RestController
public class IncidentController {
@Autowired
public IncidentService incidentservice;
@CrossOrigin(origins="http://localhost:4200")
@PostMapping("/addincident")
public ResponseEntity<String>addincident(@RequestBody Incident incident){
	return this.incidentservice.addIncident(incident);
}
@CrossOrigin(origins="http://localhost:4200")
@PostMapping("/incident/{id}")
public ResponseEntity<Incident> getIncidentById(@PathVariable int id) {
    // Use the IncidentService to fetch the incident by ID
    return incidentservice.getIncidentById(id)
            .map(incident -> new ResponseEntity<>(incident, HttpStatus.OK))
            .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
}
}