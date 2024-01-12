package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Notification;

public interface NotificationRepository extends JpaRepository<Notification,Long> {

}
