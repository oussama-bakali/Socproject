package com.example.demo.services;





import com.example.demo.entities.Utilisateur;
import com.example.demo.repo.UtilisateurRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class UtilisateurService {
@Autowired
    private  UtilisateurRepository utilisateurRepository;


   
    public UtilisateurService(UtilisateurRepository utilisateurRepository) {
        this.utilisateurRepository = utilisateurRepository;
        
    }

    public Utilisateur findUserByEmail(String email) {
        return utilisateurRepository.findByEmail(email);
    }

    public ResponseEntity<String> registerUser(int id,String nom, String email, String password) {
        // Check if the email is already registered
        if (utilisateurRepository.findByEmail(email) != null) {
            // You might want to handle this case differently (e.g., throw an exception)
            return null;
        }

        // Encrypt the password before storing it in the database
        String encryptedPassword = password;

        // Create a new utilisateur
        Utilisateur utilisateur = new Utilisateur();
        utilisateur.setId(id);
        utilisateur.setNom(nom);
        utilisateur.setEmail(email);
        utilisateur.setPassword(encryptedPassword);
this.utilisateurRepository.save(utilisateur);
        // Save the utilisateur in the database
         return new ResponseEntity<>("{\"message\":\"registersuccessfuly\"}",HttpStatus.OK);
    }

    public ResponseEntity<String> loginUser(String email, String password) {
        // Find the user by email
        Utilisateur utilisateur = utilisateurRepository.findByEmail(email);

        // Check if the user exists and the provided password matches the stored encrypted password
        if ( utilisateur.getPassword().equals(password)) {
        	return new ResponseEntity<>("{\"successmessage\":\"login successful\"}",HttpStatus.OK);
        }
        return new ResponseEntity<>("{\"message\":\"email or password not excisting\"}",HttpStatus.OK);
    }
    public Optional<Utilisateur> getIncidentById(int id) {
        return this.utilisateurRepository.findById((long)id);
    }
}


