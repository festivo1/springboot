///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.utsicom.web.dao.impl;
//
//import com.utsicom.web.dao.CategoryDAO;
//import com.utsicom.web.entity.Category;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Repository;
//import org.hibernate.Session;
//
///**
// *
// * @author utsi
// */
//@Repository("CategoryDAO")
//public class CategoryDAOImpl implements CategoryDAO {
//    @Autowired
//    private SessionFactory sessionFactory;
//     public List<Category> getAll() {
//         Session session= null;
//         try{
//            session= sessionFactory.openSession();
//            return session.createCriteria(Category.class).list();
//         }catch(Exception e){
//             e.printStackTrace();
//     }
//        return null;
//     }
//}
////
////    @Autowired
////    private JdbcTemplate jdbcTemplate;
////    //private CategoryDAO categorydao;
////    //Declares a constructor, field, setter method, or configuration method
////    //to be autowired by type. Items annotated with @Autowired do not
////    //have to be public.  
////
////    @Override
////    public List<Category> getAll() {
////
////        return jdbcTemplate.query("SELECT * FROM categories", (ResultSet rs, int i) -> {
////            Category category = new Category();
////            category.setId(rs.getInt("id"));
////            category.setName(rs.getString("name"));
////            category.setDescription(rs.getString("description"));
////            category.setStatus(rs.getBoolean("status"));
////            //category.setAddedDate(rs.getDate("added_date"));
////            return category;
////        });
//
//   // }
//
//
