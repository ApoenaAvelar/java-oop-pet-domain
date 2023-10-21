package org.avelar.model.people;
import org.avelar.model.pets.PetBase;

import java.util.ArrayList;
import java.util.List;

public class PetWalker extends People{

    private final List<PetBase> petBaseList = new ArrayList<>();
    public PetWalker(String name, String documentId, GenderEnum GENDER) {
        super(name, documentId, GENDER);

    }

    public void hireService(PetBase pet){
        this.petBaseList.add(pet);
    }

    public void getPetList(){
        for (PetBase petBase : petBaseList) {
            System.out.printf("%s: %s", petBase.getClass().getName(), petBase.getName());
        }

    }


}
