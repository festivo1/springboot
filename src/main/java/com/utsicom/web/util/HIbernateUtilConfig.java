


///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package com.utsicom.web.util;
//
//import javax.persistence.EntityManagerFactory;
//import org.hibernate.SessionFactory;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// *
// * @author utsi
// */
//@Configuration
//public class HibernateUtilConfig {
//    @Autowired
//    private EntityManagerFactory entityManagerFactory;
//    
//    @Bean
//    public SessionFactory getSessionFactory(){
//        if(entityManagerFactory.unwrap(SessionFactory.class)==null){
//            throw new NullPointerException("factory is not a hibernate factory");
//        }
//        return entityManagerFactory.unwrap(SessionFactory.class);
//    }
//    
//}
