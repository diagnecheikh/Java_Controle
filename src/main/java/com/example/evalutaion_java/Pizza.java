package com.example.evalutaion_java;

public class Pizza {
    // nom, id, prix, nbrIngredients
    private String nom;
    private int id;
    private double prix;
    private int nbrIngredients;

    public Pizza(String nom, double prix, int nbrIngredients) {
        this.nom = nom;
        this.prix = prix;
        this.nbrIngredients = nbrIngredients;

    }
    public Pizza(){

    }

    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }
}
