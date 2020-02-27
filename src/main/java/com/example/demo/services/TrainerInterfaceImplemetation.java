/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.models.Trainers;
import com.example.demo.repositories.TrainerRepository;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author panos
 */
@Service
@Transactional
public class TrainerInterfaceImplemetation implements TrainerInterface{
    
    @Autowired
    TrainerRepository tr;
    
    @Override
    public void insertTrainer(Trainers t) {
        tr.save(t);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Trainers> getAllTrainers() {
        ArrayList<Trainers> a = (ArrayList<Trainers>) tr.findAll();
        return a;
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTrainer(Trainers t) {
        tr.save(t);
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    @Transactional
    @Override
    public void deleteTrainer(Integer id){
        tr.deleteById(id);
    
    }
    
    @Override
    public Trainers fetchById(Integer id){
    
        Trainers t = tr.findById(id).get();//vazw to get() gia na to parv apo to optional
        return t;
    }
    
    /**
     *
     * @param tran
     */
    @Override
    public void saveTrainers(Trainers tran){
        
        tr.save(tran);
    
    }
}
