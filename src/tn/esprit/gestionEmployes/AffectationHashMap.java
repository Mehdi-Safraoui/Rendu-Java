package tn.esprit.gestionEmployes;

import tn.esprit.gestionDepartements.Departement;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AffectationHashMap {
    private Map <Employe, Departement> map = new HashMap <Employe, Departement>();

    public void ajouterEmployeDepartement(Employe e, Departement d){
        map.put(e, d);
    }

    public void afficherEmployesEtDepartements (){
        System.out.println(map.toString());
    }

    public void supprimerEmployeEtDepartement (Employe e, Departement d){
        map.remove(e,d);
    }

    public void afficherEmployes(){
        System.out.println(map.keySet().toString());
    }

    public void afficherDepartements(){
        System.out.println(map.values().toString());
    }

    public boolean rechercherEmploye (Employe e){
        return map.containsKey(e);
    }

    public boolean rechercherDepartement (Departement d){
        return map.containsValue(d);
    }

    public TreeMap<Employe , Departement> trierMap(){
        TreeMap<Employe , Departement> treeMap = new TreeMap<Employe , Departement>();
        treeMap.putAll(map);
        return treeMap;
    }

}
