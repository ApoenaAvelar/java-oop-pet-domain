package org.avelar.model.pets;

public class Dog extends PetBase{
    public Dog(String name, String weigh, String registerId) {
        super(name, weigh, registerId);
    }

    public Dog(String name, String weigh, String registerId, String breed) {
        super(name, weigh, registerId, breed);
    }

    public void speak(){
        System.out.printf("The dog %s barked \n", this.getName());
    }


}
