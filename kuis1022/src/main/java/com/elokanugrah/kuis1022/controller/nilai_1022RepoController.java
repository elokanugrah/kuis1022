/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elokanugrah.kuis1022.controller;

import com.elokanugrah.kuis1022.entity.nilai_1022;
import com.elokanugrah.kuis1022.service.nilai_1022Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 *
 * @author Mahasiswa 20
 */
@RestController
@RequestMapping("/nilai_1022")
public class nilai_1022RepoController {
    @Autowired
    private nilai_1022Service nilai_1022Service;

    @RequestMapping(method = RequestMethod.POST)
    public nilai_1022 insert(@RequestBody nilai_1022 nilai_1022) {
        return nilai_1022Service.insert(nilai_1022);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public nilai_1022 update(@RequestBody nilai_1022 nilai_1022) {
        return nilai_1022Service.update(nilai_1022);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return nilai_1022Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public nilai_1022 getByNama(@PathVariable("id") Long id){
        return nilai_1022Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<nilai_1022> getAll(){
        return nilai_1022Service.getAll();
    }
}
