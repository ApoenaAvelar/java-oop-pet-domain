package org.avelar.model.pets;

public class Dog extends PetBase{
    public Dog(String name, String weigh, String registerId) {
        super(name, weigh, registerId);
    }

    public Dog(String name, String weigh, String registerId, String race) {
        super(name, weigh, registerId, race);
    }

    public void speak(){
        System.out.printf("The dog %s barked", this.getName());
    }

    @Override
    public void getPetInfo() {
        System.out.println("It's a dog.");
        super.getPetInfo();
    }
}
