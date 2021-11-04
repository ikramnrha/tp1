package com.example.tp1.bean;

import javax.persistence.*;

@Entity
public class Stock {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private Materiel materiel;
    private double quantite;
    private double quantiteDetruite;

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

    public double getQuantiteDetruite() {
        return quantiteDetruite;
    }

    public void setQuantiteDetruite(double quantiteDetruite) {
        this.quantiteDetruite = quantiteDetruite;
    }
}
