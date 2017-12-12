/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elokanugrah.kuis1022.controller;

import com.elokanugrah.kuis1022.entity.cv_1022;
import com.elokanugrah.kuis1022.service.cv_1022Service;
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
@RequestMapping("/cv_1022")
public class cv_1022Controller {
    @Autowired
    private cv_1022Service cv_1022Service;

    @RequestMapping(method = RequestMethod.POST)
    public cv_1022 insert(@RequestBody cv_1022 cv_1022) {
        return cv_1022Service.insert(cv_1022);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public cv_1022 update(@RequestBody cv_1022 cv_1022) {
        return cv_1022Service.update(cv_1022);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return cv_1022Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public cv_1022 getByNama(@PathVariable("id") Long id){
        return cv_1022Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<cv_1022> getAll(){
        return cv_1022Service.getAll();
    }
}
