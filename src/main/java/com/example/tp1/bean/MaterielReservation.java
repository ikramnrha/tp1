package com.example.tp1.bean;

import javax.persistence.*;

@Entity
public class MaterielReservation {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private double quantite;
    private double quantiteRendu;
    @ManyToOne
    private Reservation reservation;
    @ManyToOne
    private Materiel materiel;
    @ManyToOne
    private EtatReservation etatReservation;

    public double getQuantiteRendu() {
        return quantiteRendu;
    }

    public void setQuantiteRendu(double quantiteRendu) {
        this.quantiteRendu = quantiteRendu;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public EtatReservation getEtatReservation() {
        return etatReservation;
    }

    public void setEtatReservation(EtatReservation etatReservation) {
        this.etatReservation = etatReservation;
    }

    public Materiel getMateriel() {
        return materiel;
    }

    public void setMateriel(Materiel materiel) {
        this.materiel = materiel;
    }
}
