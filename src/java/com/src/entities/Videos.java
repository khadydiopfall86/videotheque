/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.src.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author USER
 */
@Entity
@Table(name = "videos", catalog = "films", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Videos.findAll", query = "SELECT v FROM Videos v")
    , @NamedQuery(name = "Videos.findById", query = "SELECT v FROM Videos v WHERE v.id = :id")
    , @NamedQuery(name = "Videos.findByNom", query = "SELECT v FROM Videos v WHERE v.nom = :nom")
    , @NamedQuery(name = "Videos.findByDuree", query = "SELECT v FROM Videos v WHERE v.duree = :duree")
    , @NamedQuery(name = "Videos.findByAnnee", query = "SELECT v FROM Videos v WHERE v.annee = :annee")
    , @NamedQuery(name = "Videos.findByType", query = "SELECT v FROM Videos v WHERE v.type = :type")
    , @NamedQuery(name = "Videos.findByPrix", query = "SELECT v FROM Videos v WHERE v.prix = :prix")})
public class Videos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "nom", nullable = false, length = 50)
    private String nom;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "synopsie", nullable = false, length = 65535)
    private String synopsie;
    @Size(max = 15)
    @Column(name = "duree", length = 15)
    private String duree;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "annee", nullable = false, length = 10)
    private String annee;
    @Lob
    @Column(name = "image")
    private byte[] image;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "type", nullable = false, length = 20)
    private String type;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "prix", nullable = false, length = 20)
    private String prix;

    public Videos() {
    }

    public Videos(Integer id) {
        this.id = id;
    }

    public Videos(Integer id, String nom, String synopsie, String annee, String type, String prix) {
        this.id = id;
        this.nom = nom;
        this.synopsie = synopsie;
        this.annee = annee;
        this.type = type;
        this.prix = prix;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getSynopsie() {
        return synopsie;
    }

    public void setSynopsie(String synopsie) {
        this.synopsie = synopsie;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }

    public String getAnnee() {
        return annee;
    }

    public void setAnnee(String annee) {
        this.annee = annee;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(String prix) {
        this.prix = prix;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Videos)) {
            return false;
        }
        Videos other = (Videos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.src.entities.Videos[ id=" + id + " ]";
    }
    
}
