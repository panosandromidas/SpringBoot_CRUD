/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controllers;

import com.example.demo.models.Trainers;
import com.example.demo.services.TrainerInterface;
import com.example.demo.services.TrainerInterfaceImplemetation;
import java.util.ArrayList;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author panos
 */
@Controller
public class TrainerController {
    @Autowired 
    TrainerInterfaceImplemetation tr;
    
    
    @GetMapping("trainersform")
    public String goForm(){
        return "trainersform";
    }
    
    @GetMapping("home")
    public String goHome(){
        return "home";
    }
    
    
    // edw kanv to insert..create..ayot akouei th forma
    @PostMapping("submitform")                 //PostMapping για να πάρει από τη φόρμα (έχω βάλει method post Στη φόρμα)
    public String FormController(ModelMap mm,
            @RequestParam(name = "trainername") String trainername,
            @RequestParam(name = "trainerage") String trainerage) {
            //@RequestParam(name = "radio") String radio) {
        
               
//        mm.addAttribute("name", trainername);
//        mm.addAttribute("age", trainerage);
        //mm.addAttribute("radio", radio);
        Trainers t = new Trainers(trainername,trainerage);
        tr.insertTrainer(t);
        
        
        
        return "epityxesadd";
    }
    
    
        @GetMapping("/alltrainers")
    public String goAllTrainers(ModelMap mm){
        ArrayList<Trainers> result = tr.getAllTrainers();
        
        mm.addAttribute("oloitrainers", result);
    
        return "/alltrainers";
    }
    
    
    //edw kanei to delete

    /**
     *
     * @param id
     * @param mn
     * @return
     */
    @RequestMapping(value = "/delete/{trainerid}", method = RequestMethod.GET)
    public String doDelete(@PathVariable("trainerid") Integer id, ModelMap mn){
        
        tr.deleteTrainer(id);
        ArrayList<Trainers> result = tr.getAllTrainers();
        
        mn.addAttribute("oloitrainers", result);
        
        
//    return "alltrainers";
    return "/alltrainers";
    }
    
    
    @RequestMapping(value = "update/{trainerid}", method = RequestMethod.GET)
    public String preUpdateTrainer(@PathVariable(name="trainerid") Integer id,ModelMap mm){
//      1. get id
    //  2. fetch trainer
        
       Trainers tra = tr.fetchById(id);
        
    //    3.  put trainer in modelmap mm
    mm.addAttribute("trainer", tra);
    //mm.addAttribute("idtrainer",id);
//    return "updateform";//todo}
    return "updateformtrainer";
    
    }
    
    
    
    @GetMapping("arxikh")
    public String goArxikh(){
        return "arxikh";
    }
            
    
//    @GetMapping("/changetrainer/{trainerid}")
//    @RequestMapping(value = "/changetrainer/{trainerid}", method = RequestMethod.GET)
//    public String changeAfterUpdate( @RequestParam(name="trainerid") Integer idd ,
//            @RequestParam(name="trainername") String trainername,
//            @RequestParam(name="trainerage") String trainerage){
//        Trainers tra = tr.fetchById(idd);
//        tra.setTrainername(trainername);
//        tra.setTrainerage(trainerage);
//        tr.saveTrainers(tra);
//    return "home";
//    }
//      @PostMapping(value = "/changetrainer")
    @Transactional
    @PostMapping(value = "changetrainer")
    public String updateTrainer( @ModelAttribute("trainer") Trainers tra) {

        Trainers t = new Trainers();
        t.setTrainerid(tra.getTrainerid());
        t.setTrainername(tra.getTrainername());
        t.setTrainerage(tra.getTrainerage());
        tr.updateTrainer(t);
        
        return "redirect:/alltrainers";
    }      
}
