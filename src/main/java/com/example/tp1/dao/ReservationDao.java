package com.example.tp1.dao;

import com.example.tp1.bean.Reservation;
import com.example.tp1.bean.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationDao extends JpaRepository<Reservation,Long> {
    Reservation findByReference(String reference);
    List<Reservation> findAllBy(Utilisateur utilisateur);
    List<>

}
