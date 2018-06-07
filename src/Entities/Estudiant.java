package Entities;

import java.util.Collection;

public class Estudiant {

    private long id;
    private String nom;
    private String cognoms;
    private String dni;
    private int curs;
    private Collection assignatures;

    public Estudiant(long id, String nom, String cognoms, String dni, int curs, Collection assignatures) {
        this.id = id;
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
        this.curs = curs;
        this.assignatures = assignatures;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getCurs() {
        return curs;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public Collection getAssignatures() {
        return assignatures;
    }

    public void setAssignatures(Collection assignatures) {
        this.assignatures = assignatures;
    }
}
