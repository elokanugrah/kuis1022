/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elokanugrah.kuis1022.service;

import com.elokanugrah.kuis1022.entity.nilai_1022;
import com.elokanugrah.kuis1022.repo.nilai_1022Repo;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Mahasiswa 20
 */
@Service("nilai_1022Service")
@Transactional
public class nilai_1022Service {
    @Autowired
    private nilai_1022Repo repo;

    public nilai_1022 insert(nilai_1022 nilai_1022) {
        return repo.save(nilai_1022);
    }
    
    public nilai_1022 update(nilai_1022 nilai_1022) {
        return repo.save(nilai_1022);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public nilai_1022 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<nilai_1022> getAll(){
        return repo.findAllnilai_1022();
    }
}
