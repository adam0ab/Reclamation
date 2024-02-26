package entities;

public class preference {
    int id ;
    String taille  ;
    String style;
    String marque ;
    String couleur;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTaille() {
        return taille;
    }

    public void setTaille(String taille) {
        this.taille = taille;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return "preference{" +
                "id=" + id +
                ", taille='" + taille + '\'' +
                ", style='" + style + '\'' +
                ", marque='" + marque+ '\'' +
                ", couleur='" + couleur + '\'' +
                '}';
    }

    public preference() {
    }

    public preference(int id,String taille ,String style, String marque, String couleur) {
        this.id = id;
        this.taille = taille;
        this.style = style;
        this.marque = marque;
        this.couleur = couleur;
    }

    public preference(String taille ,String style, String marque, String couleur) {
        this.taille = taille;
        this.style = style;
        this.marque = marque;
        this.couleur=couleur ;
    }



}
