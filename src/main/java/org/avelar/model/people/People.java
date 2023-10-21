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


}
