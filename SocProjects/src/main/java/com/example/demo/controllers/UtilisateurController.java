package com.example.demo.controllers;




import com.example.demo.entities.Utilisateur;
import com.example.demo.services.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

@RestController

public class UtilisateurController {
	@Autowired
   private  UtilisateurService utilisateurService;

   
	@CrossOrigin(origins="http://localhost:4200")
    @GetMapping("/{email}")
    public Utilisateur getUserByEmail(@PathVariable String email) {
        return utilisateurService.findUserByEmail(email);
    }
    @CrossOrigin(origins="http://localhost:4200")
    @PostMapping("/register")
    public ResponseEntity<String> registerUser(@RequestBody Utilisateur utilisateur) {
        // Assuming the client sends a JSON object representing the user
        // including fields like "nom", "email", and "password"
    	System.out.println(utilisateur.getEmail());
        return utilisateurService.registerUser(utilisateur.getId(),utilisateur.getNom(), utilisateur.getEmail(), utilisateur.getPassword());
    }
    @CrossOrigin(origins="http://localhost:4200")
    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody Utilisateur utilisateur) {
        // Assuming the client sends a JSON object representing the user
        // including fields like "email" and "password"
        return utilisateurService.loginUser(utilisateur.getEmail(), utilisateur.getPassword());
    }
    @CrossOrigin(origins="http://localhost:4200")
    @PostMapping("/searchuser/{id}")
    public ResponseEntity<Utilisateur> getIncidentById(@PathVariable int id) {
        // Use the IncidentService to fetch the incident by ID
        return this.utilisateurService.getIncidentById(id)
                .map(incident -> new ResponseEntity<>(incident, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}

