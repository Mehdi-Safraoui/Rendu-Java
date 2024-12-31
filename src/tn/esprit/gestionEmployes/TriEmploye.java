package tn.esprit.gestionEmployes;

import java.util.Comparator;

public class TriEmploye implements Comparator<Employe> {
    @Override
    public int compare(Employe e1, Employe e2) {
        if (e1.getNom_dep().compareTo(e2.getNom_dep())>0) {
            return 1;
        }else if (e1.getNom_dep().compareTo(e2.getNom_dep())<0) {
            return -1;
        } else
            return e1.getGrade()- e2.getGrade();
    }
}
