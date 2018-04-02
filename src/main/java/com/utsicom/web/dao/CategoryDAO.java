/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.utsicom.web.dao;

import com.utsicom.web.entity.Category;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Transactional
@Repository
public interface CategoryDAO extends CrudRepository<Category, Integer>{
     @Override
    public List<Category> findAll();
}
