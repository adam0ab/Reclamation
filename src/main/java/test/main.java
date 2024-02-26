package test;

import entities.reclamation;
import services.ServiceReclamation;
import entities.preference;
import services.ServicePreference;

import java.sql.SQLException;

public class main {
    public static void main(String[]args){
        /*MyDB db1 = MyDB.getInstance();
        MyDB db2 = MyDB.getInstance();
        System.out.println(db1.hashCode());
//        System.out.println(db2.hashCode());*/
        reclamation r1 = new reclamation(42,
                "pas de livraison ",
                "Jai reçu ma commande avec un retard de deux jours",
                "En attente", "2024-02-15" ) ;
        reclamation r2 = new reclamation(
                "Article endommagé",
                "Le pantalon que jai commandé est arrivé déchiré",
                "En cours de traitement ", "2024-02-14" ) ;
        reclamation r3 = new reclamation(
                "Taille incorrecte",
                "La taille du pull que jai reçu est trop petite",
                "Résolu", "2024-02-13" ) ;
        reclamation r4 = new reclamation(
                "Couleur différente",
                "La couleur de la robe ne correspond pas à ce qui était affiché sur le site.",
                "Annulé", "2024-02-12" ) ;
        ServiceReclamation services = new ServiceReclamation();
        try {
            services.ajouter(r1);
            services.ajouter(r2);
            services.ajouter(r3);
           services.ajouter(r4);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
            }

        preference p1 = new preference(
                "XS",
                "Décontracté",
                "Nike","Noir" ) ;
        preference p2 = new preference(
                "S",
               "Sportif",
                "Adidas", "Blanc" ) ;
        preference p3 = new preference(
                "M",
                "Chic",
                "Zara", "Bleu" ) ;
        preference p4 = new preference(
                "L",
                "Vintage",
                "H&M", "Rouge" ) ;
        ServicePreference servicess = new ServicePreference();
        try {
            servicess.ajouter(p1);
            servicess.ajouter(p2);
            servicess.ajouter(p3);
            servicess.ajouter(p4);

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(services.afficher());
        } catch (SQLException e ) {
            System.out.println(e.getMessage());
        }
        try {
            services.modifier(r1);
        } catch (SQLException e ) {
            System.out.println(e.getMessage());
        }
        try {
            services.supprimer(r1);
        } catch (SQLException e ) {
            System.out.println(e.getMessage());
        }

    }}

