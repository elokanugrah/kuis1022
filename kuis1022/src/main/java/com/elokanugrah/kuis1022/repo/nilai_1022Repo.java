/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elokanugrah.kuis1022.repo;

import com.elokanugrah.kuis1022.entity.nilai_1022;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author Mahasiswa 20
 */
public interface nilai_1022Repo extends CrudRepository<nilai_1022, Long>{
    @Query("select p from nilai_1022 p")
    public List<nilai_1022> findAllnilai_1022();
    
}
