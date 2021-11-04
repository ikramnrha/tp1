package com.example.tp1.bean;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Reservation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private Date dateReservation;
    @ManyToOne
    private Utilisateur utilisateur;
    @ManyToOne
    private EtatReservation etatReservation;


    public EtatReservation getEtatReservation() {
        return etatReservation;
    }

    public void setEtatReservation(EtatReservation etatReservation) {
        this.etatReservation = etatReservation;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

}
