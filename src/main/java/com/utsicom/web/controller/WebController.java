/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.web.controller;

import com.utsicom.web.dao.CategoryDAO;
//import com.utsicom.web.dao.impl.CategoryDAOImpl;
import com.utsicom.web.entity.Category;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author utsi
 */
@RestController
@RequestMapping("/categories")
public class WebController {
    @Autowired
    private CategoryDAO categorydao;
    
    @RequestMapping(method=RequestMethod.GET)
    public List<Category> index() throws ClassNotFoundException, SQLException{
        
        return categorydao.findAll();
    }
    
}
