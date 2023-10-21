package org.avelar.model.people;

import org.avelar.model.petShop.PetShopServices;
import org.avelar.model.pets.PetBase;

public class Tutor extends People{

    private PetBase myPet = null ;


    public Tutor(String name, String documentId, GenderEnum GENDER, PetBase pet) {
        super(name, documentId, GENDER);
        this.myPet = pet;

    }


    public String getPetInfo(){
        return this.myPet.toString();
    }


    public void doPetShopping(PetShopServices service) {
        System.out.printf("The %s %s has used a pet shop service: %s \n", this.myPet.getClass().getSimpleName(),
                this.myPet.getName(), service.name());
    }




}
