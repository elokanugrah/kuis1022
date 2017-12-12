/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elokanugrah.kuis1022.repo;

import com.elokanugrah.kuis1022.entity.cv_1022;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Mahasiswa 20
 */
public interface cv_1022Repo extends CrudRepository<cv_1022, Long>{
    @Query("select c from cv_1022 c")
    public List<cv_1022> findAllcv_1022();
    
}
