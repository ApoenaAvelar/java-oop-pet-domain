package org.avelar.model.people;

import org.avelar.model.pets.PetBase;

public class Tutor extends People{

    private PetBase myPet = null ;


    public Tutor(String name, String documentId, GenderEnum GENDER, PetBase pet) {
        super(name, documentId, GENDER);
        this.myPet = pet;

    }

    public void getPetInfo(){
        System.out.printf("%S");
    }




}
