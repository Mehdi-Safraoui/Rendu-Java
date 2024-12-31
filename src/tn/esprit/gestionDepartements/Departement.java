package tn.esprit.gestionDepartements;

import java.util.Objects;

public class Departement {
    private int id;
    private String nomDept;
    private int nbrEmp;

    public Departement() {
    }

    public Departement(int id, String nomDept, int nbrEmp) {
        this.id = id;
        this.nomDept = nomDept;
        this.nbrEmp = nbrEmp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomDept() {
        return nomDept;
    }

    public void setNomDept(String nomDept) {
        this.nomDept = nomDept;
    }

    public int getNbrEmp() {
        return nbrEmp;
    }

    public void setNbrEmp(int nbrEmp) {
        this.nbrEmp = nbrEmp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Departement that = (Departement) o;
        return id == that.id && Objects.equals(nomDept, that.nomDept);
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id=" + id +
                ", nomDept='" + nomDept + '\'' +
                ", nbrEmp=" + nbrEmp +
                '}';
    }
}
