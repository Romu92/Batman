package it.aulab.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.aulab.model.Batman;


@Component("batmanRepositiry")
// può sostituire il bean
public class BatmanRepositoryImpl implements BatmanRepository {

    @Autowired
    private Batman batman;
    public BatmanRepositoryImpl() {
        System.out.println("Create Repository");
    }

    @Override
    public Batman getBatman() {
     return this.batman;  
    }
    
    @Override
    public void setBatman(Batman batman) {
        this.batman=batman;
    }
    
}

// serve a creare l'oggetto nel database
