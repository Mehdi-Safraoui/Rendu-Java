package tn.esprit;

import tn.esprit.gestionDepartements.Departement;
import tn.esprit.gestionEmployes.AffectationHashMap;
import tn.esprit.gestionEmployes.Employe;

import java.util.Map;

public class main {
    public static void main(String[] args) {
        Employe employe = new Employe(1,"nom 1" , "prenom 1" , "da" , 1);
        Employe employe2 = new Employe(2,"nom 2" , "prenom 2" , "dp" , 2);
        Employe employe3 = new Employe(3,"nom 3" , "prenom 3" , "da" , 3);

        Departement departement1 = new Departement(1 , "da" , 17);
        Departement departement2 = new Departement(2 , "dp" , 40);

        AffectationHashMap affectHashMap = new AffectationHashMap();
        affectHashMap.ajouterEmployeDepartement(employe,departement1);
        affectHashMap.ajouterEmployeDepartement(employe,departement2);

        affectHashMap.afficherEmployesEtDepartements();
    }
}
