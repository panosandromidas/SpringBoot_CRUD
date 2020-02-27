/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.models;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author panos
 */
@Entity
@Table(name = "trainers")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainers.findAll", query = "SELECT t FROM Trainers t")
    , @NamedQuery(name = "Trainers.findByTrainerid", query = "SELECT t FROM Trainers t WHERE t.trainerid = :trainerid")
    , @NamedQuery(name = "Trainers.findByTrainername", query = "SELECT t FROM Trainers t WHERE t.trainername = :trainername")
    , @NamedQuery(name = "Trainers.findByTrainerage", query = "SELECT t FROM Trainers t WHERE t.trainerage = :trainerage")})
public class Trainers implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trainerid")
    private Integer trainerid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "trainername")
    private String trainername;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "trainerage")
    private String trainerage;

    public Trainers() {
    }

    public Trainers(String trainername, String trainerage) {
        this.trainername = trainername;
        this.trainerage = trainerage;
    }
    
    

    public Trainers(Integer trainerid) {
        this.trainerid = trainerid;
    }

    public Trainers(Integer trainerid, String trainername, String trainerage) {
        this.trainerid = trainerid;
        this.trainername = trainername;
        this.trainerage = trainerage;
    }

    public Integer getTrainerid() {
        return trainerid;
    }

    public void setTrainerid(Integer trainerid) {
        this.trainerid = trainerid;
    }

    public String getTrainername() {
        return trainername;
    }

    public void setTrainername(String trainername) {
        this.trainername = trainername;
    }

    public String getTrainerage() {
        return trainerage;
    }

    public void setTrainerage(String trainerage) {
        this.trainerage = trainerage;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainerid != null ? trainerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainers)) {
            return false;
        }
        Trainers other = (Trainers) object;
        if ((this.trainerid == null && other.trainerid != null) || (this.trainerid != null && !this.trainerid.equals(other.trainerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.example.demo.models.Trainers[ trainerid=" + trainerid + " ]";
    }
    
}
