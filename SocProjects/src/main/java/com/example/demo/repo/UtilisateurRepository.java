package com.example.demo.repo;



import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur,Long>{
	Utilisateur findByEmail(String email);	

}

