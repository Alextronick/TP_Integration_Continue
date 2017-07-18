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
@Table(name = "role")
public class Role {
	@Id
	@Column(name="titre")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private String titre;
    private int idActeur;
    private String nomRole;

    public Role(String _titre, int _idActeur, String _nomRole)
    {
        super();
        this.titre = _titre;
        this.idActeur = _idActeur;
        this.nomRole = _nomRole;
    }

    public Role() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the titre
     */
    public String getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }

    /**
     * @return the idActeur
     */
    public int getIdActeur() {
        return idActeur;
    }

    /**
     * @param idActeur the idActeur to set
     */
    public void setIdActeur(int idActeur) {
        this.idActeur = idActeur;
    }

    /**
     * @return the nomRole
     */
    public String getNomRole() {
        return nomRole;
    }

    /**
     * @param nomRole the nomRole to set
     */
    public void setNomRole(String nomRole) {
        this.nomRole = nomRole;
    }
    
    
}
