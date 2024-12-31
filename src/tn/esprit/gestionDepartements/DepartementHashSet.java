package tn.esprit.gestionDepartements;

import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDépartement<Departement>{

    private HashSet<Departement> departements;

    public DepartementHashSet() {
        departements = new HashSet<>();
    }

    @Override
    public void ajouterDepartement(Departement departement) {
        departements.add(departement);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Departement departement : departements) {
            {
                if (departement.getNomDept().equalsIgnoreCase(nom))
                    return true; // Département trouvé
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Departement departement) {
        return departements.contains(departement);
    }

    @Override
    public void supprimerDepartement(Departement departement) {
        if (departements.remove(departement)) {
            System.out.println("Département supprimé : " + departement);
        } else {
            System.out.println("Département non trouvé : " + departement);
        }
    }

    @Override
    public void displayDepartement() {
        for (Departement d : departements) {
            System.out.println(d);
        }
    }

    @Override
    public TreeSet<Departement> trierDepartementById() {
        TreeSet<Departement> sortedDepartments = new TreeSet<>(
                (d1, d2) -> Integer.compare(d1.getId(), d2.getId())
        );
        sortedDepartments.addAll(departements);
        return sortedDepartments; // Retourne un TreeSet trié par ID
    }
}
