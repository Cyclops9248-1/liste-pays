package com.janvier.listepays;

public class Pays
{
    private String nom;
    private int drapeau;
    private int superficie;

    public Pays(String nom, int drapeau, int superficie) {
        this.nom = nom;
        this.drapeau = drapeau;
        this.superficie = superficie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getDrapeau() {
        return drapeau;
    }

    public void setDrapeau(int drapeau) {
        this.drapeau = drapeau;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }
}
