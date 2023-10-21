package org.avelar.model.people;

import org.avelar.model.pets.PetBase;



public class People {


    private String name;
    private String documentId ;
    private final GenderEnum GENDER;

    public People(String name, String documentId, GenderEnum GENDER) {
        this.name = name;
        this.documentId = documentId;
        this.GENDER = GENDER;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public GenderEnum getGENDER() {
        return GENDER;
    }

    public void interact(PetBase pet) {
        String petKind = pet.getClass().getName();
        //FIXME concertar essa lógica, deve avaliar o tipo de pessoa e não o tipo de pet
        switch (petKind) {
            case "People":
                System.out.printf("A person is petting someone else's %s ", petKind);
                break;
            case "Tutor":
                System.out.printf("%s is petting %s %s %s",
                this.getName(),
                (this.getGENDER().name().equals("MAN") ? "his" : "her"),
                petKind,
                pet.getName());
                break;
            case "PetWalker":
                System.out.printf("A pet walker named %s is walking with the %s %s",
                        this.getName(), petKind, pet.getName())   ;


        }
    }
}
