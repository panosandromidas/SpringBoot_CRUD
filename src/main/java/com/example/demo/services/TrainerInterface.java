/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.models.Trainers;
import java.util.ArrayList;

/**
 *
 * @author panos
 */
public interface TrainerInterface {
    
    public void insertTrainer(Trainers t);//edw h8ela onoma  trainer gia pio katanohsh alla de peirazei
    public ArrayList<Trainers> getAllTrainers();
    public void updateTrainer(Trainers t);
    public void deleteTrainer(Integer id);
    public Trainers fetchById(Integer id);
    public void saveTrainers(Trainers tran);
    
}
