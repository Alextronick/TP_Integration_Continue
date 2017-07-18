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
@Table(name = "film")
public class Film {
	@Id
	@Column(name="titre")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
    private long titre;
    private int annee;
    private int idMES;
    private String genre;
    private String resume;

    public Film(long _titre, int _annee, int _idMES, String _genre, String _resume)
    {
        super();
        this.titre = _titre;
        this.annee = _annee;
        this.idMES = _idMES;
        this.genre = _genre;
        this.resume = _resume;
    }

    /**
     * @return the titre
     */
    public long getTitre() {
        return titre;
    }

    /**
     * @param titre the titre to set
     */
    public void setTitre(long titre) {
        this.titre = titre;
    }

    /**
     * @return the annee
     */
    public int getAnnee() {
        return annee;
    }

    /**
     * @param annee the annee to set
     */
    public void setAnnee(int annee) {
        this.annee = annee;
    }

    /**
     * @return the idMES
     */
    public int getIdMES() {
        return idMES;
    }

    /**
     * @param idMES the idMES to set
     */
    public void setIdMES(int idMES) {
        this.idMES = idMES;
    }

    /**
     * @return the genre
     */
    public String getGenre() {
        return genre;
    }

    /**
     * @param genre the genre to set
     */
    public void setGenre(String genre) {
        this.genre = genre;
    }

    /**
     * @return the resume
     */
    public String getResume() {
        return resume;
    }

    /**
     * @param resume the resume to set
     */
    public void setResume(String resume) {
        this.resume = resume;
    }
    
    
}