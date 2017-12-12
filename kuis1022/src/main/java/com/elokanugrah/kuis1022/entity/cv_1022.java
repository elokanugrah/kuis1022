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
import javax.persistence.Table;
/**
 *
 * @author Mahasiswa 20
 */
@Entity
@Table(name = "cv_1022")
public class cv_1022 implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
    @Column(length = 100, nullable = false, unique = true)
    private String nama;
    
    @Column(length = 255, nullable = true)
    private String alamat;
    
    @Column(length = 20, nullable = true)
    private Date tgl_lahir;
    
    @Column(length = 12, nullable = true)
    private Integer no_hp;
    
    @Column(length = 100, nullable = false)
    private String keahlian;
    
    

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
    public String getNama() {
        return nama;
    }

    /**
     * @param name the name to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @param description the description to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the description
     */
    public String getAlamat() {
        return alamat;
    }
    
    public void setTgl_lahir(Date tgl_lahir) {
        this.tgl_lahir = tgl_lahir;
    }

    /**
     * @return the description
     */
    public Date getTgl_lahir() {
        return tgl_lahir;
    }
    
    public void setNo_hp(Integer no_hp) {
        this.no_hp = no_hp;
    }

    /**
     * @return the description
     */
    public Integer geNo_hp() {
        return no_hp;
    }
    
    public String getKeahlian() {
        return keahlian;
    }

    /**
     * @param name the name to set
     */
    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }
    
}
