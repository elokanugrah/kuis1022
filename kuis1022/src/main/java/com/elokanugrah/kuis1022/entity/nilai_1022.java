/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elokanugrah.kuis1022.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 *
 * @author Mahasiswa 20
 */
@Entity
@Table(name = "nilai_1022")
public class nilai_1022 implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(length = 100, nullable = false, unique = true)
    private Integer nilai;
    
    @ManyToOne
    private cv_1022 cv_1022;
    
 
    public int getId() {
        return id;
    }
    /**
     * @param name the name to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public Integer getNilai() {
        return nilai;
    }

    /**
     * @param name the name to set
     */
    public void setNilai(Integer nilai) {
        this.nilai = nilai;
    }
    
    /**
     * @return the cv_1022
     */
    public cv_1022 getcv_1022() {
        return cv_1022;
    }

    /**
     * @param cv_1022 the cv_1022 to set
     */
    public void setcv_1022(cv_1022 cv_1022) {
        this.cv_1022 = cv_1022;
    }
}
