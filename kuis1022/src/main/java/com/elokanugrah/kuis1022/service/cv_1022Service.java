/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elokanugrah.kuis1022.service;

import com.elokanugrah.kuis1022.entity.cv_1022;
import com.elokanugrah.kuis1022.repo.cv_1022Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Mahasiswa 20
 */
@Service("cv_1022Service")
@Transactional
public class cv_1022Service {
    @Autowired
    private cv_1022Repo repo;

    public cv_1022 insert(cv_1022 cv_1022) {
        return repo.save(cv_1022);
    }
    
    public cv_1022 update(cv_1022 cv_1022) {
        return repo.save(cv_1022);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public cv_1022 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<cv_1022> getAll(){
        return repo.findAllcv_1022();
    }
}
