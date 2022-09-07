package com.bnta.chocolate.Services;


import com.bnta.chocolate.models.Estate;
import com.bnta.chocolate.repositories.EstateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstateService {

    @Autowired
    EstateRepository estateRepository;


    @Autowired
    ChocolateService chocolateService;

    public List<Estate> getAllEstates(){
        return estateRepository.findAll();
    }

    public Optional<Estate> getEstateById(long id){
        return estateRepository.findById(id);
    }

}
