package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Incident;

public interface IncidentRepository extends JpaRepository<Incident,Long> {

}
