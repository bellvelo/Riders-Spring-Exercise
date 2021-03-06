package com.bellvelo.example.bikes.controllers;


import com.bellvelo.example.bikes.models.Rider;
import com.bellvelo.example.bikes.repositories.Rider.RiderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/riders")  // sets the base URL
//@RequestMapping(value = "/api")
public class RiderController {

    @Autowired
    RiderRepository riderRepository;

//    @GetMapping
//    public List<Rider> getAllRiders(){
//        return riderRepository.findAll();
//    }

    @GetMapping("{id}")
    public Optional<Rider> getRider(@PathVariable Long id){
        return riderRepository.findById(id);
    }

    @GetMapping("over/{age}")
    public List<Rider> getRider(@PathVariable int age){
        return riderRepository.getRidersOverAge(age);
    }



}
