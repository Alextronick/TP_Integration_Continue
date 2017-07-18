/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tables;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Robin Pinto
 */
@Entity
@Table(name = "artiste")
public class Artiste {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;
    private String nom;
    private String prenom;
    private int anneeNaiss;

    public Artiste(long _id, String _nom, String _prenom, int _anneeNaiss)
    {
        super();
        this.id = _id;
        this.nom = _nom;
        this.prenom = _prenom;
        this.anneeNaiss = _anneeNaiss;
    }

    public Artiste() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the prenom
     */
    public String getPrenom() {
        return prenom;
    }

    /**
     * @param prenom the prenom to set
     */
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    /**
     * @return the anneeNaiss
     */
    public int getAnneeNaiss() {
        return anneeNaiss;
    }

    /**
     * @param anneeNaiss the anneeNaiss to set
     */
    public void setAnneeNaiss(int anneeNaiss) {
        this.anneeNaiss = anneeNaiss;
    }
    
    
}
