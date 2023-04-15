package it.aulab.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import it.aulab.repository.BatmanRepository;

@Component("batmanService")
public class BatmanServiceImpl implements BatmanService {

    @Autowired
    BatmanRepository repository;
    // richiamo l'oggetto batman

 

    public BatmanServiceImpl() {
        System.out.println("Create Service");
    }

    public BatmanRepository getRepository() {
        return repository;
    }

    public void setRepository(BatmanRepository repository) {
        this.repository = repository;
    }

    @Override
    public void attack() {
        if (this.repository.getBatman() != null)
        // se batman non è null posso utilizzare il metodo
        System.out.println("Batman attack");
    }

    @Override
    public void climb() {
        if (this.repository.getBatman() != null)
        System.out.println("Batman climb");
    }

    @Override
    public void glide() {
        if (this.repository.getBatman() != null)
        System.out.println("Batman glide");
    }

    @Override
    public void goFarwardwithBatmobile() {
        if (this.repository.getBatman() != null)
        System.out.println("Batman usa la batmobile per andare avanti");
    }

    @Override
    public void goBackWithBatmobile() {
        if (this.repository.getBatman() != null)
        System.out.println("Batman usa la batmobile per andare indietro");
    }
    
}
