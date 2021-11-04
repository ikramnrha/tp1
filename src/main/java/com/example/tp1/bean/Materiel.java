package com.example.tp1.bean;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class Materiel {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String reference;
    private String libelle;
    @ManyToOne
    private EtatMateriel etatMateriel;
    private double quantite;
    @ManyToOne
    private Categorie categorie;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public EtatMateriel getEtatMateriel() {
        return etatMateriel;
    }

    public void setEtatMateriel(EtatMateriel etatMateriel) {
        this.etatMateriel = etatMateriel;
    }

    public double getQuantite() {
        return quantite;
    }

    public void setQuantite(double quantite) {
        this.quantite = quantite;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }

}
